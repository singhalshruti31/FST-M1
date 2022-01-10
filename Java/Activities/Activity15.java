package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {
    private static String FILE_NAME = System.getProperty("user.dir")+"\\TestSheet.xlsx";
    public static void main(String[] args) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sh = wb.createSheet("Cities");
        Object[][] cities = {
                {"Name", "State's Name", "S.No."},
                {"Delhi", "India's Capital", 1},
                {"Mumbai", "Maharashtra", 2},
                {"Lucknow", "Uttar Pradesh", 3},
                {"Bangalore", "Karnataka", 4},
                {"Srinagar", "J&K", 5}
        };
        int row = 0;
        for(Object[] city:cities){
            Row rw = sh.createRow(row++);
            int column = 0;
            for(Object c:city){
                Cell cl = rw.createCell(column++);
                if(c instanceof String)
                    cl.setCellValue(String.valueOf(c));
                else if(c instanceof Integer)
                    cl.setCellValue((Integer) c);
            }
        }
        FileOutputStream out = new FileOutputStream(FILE_NAME);
        wb.write(out);
        System.out.println("done");
    }
}
