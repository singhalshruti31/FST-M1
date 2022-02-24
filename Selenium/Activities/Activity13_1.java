package Activities;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
        //Load CSV file
        CSVReader reader = new CSVReader(new FileReader("C:\\Eclipse_Code\\Selenium_FST\\src\\test\\java\\sample.csv"));
        List<String[]> list = reader.readAll();
        System.out.println("Total number of rows are: " + list.size());
        Iterator<String[]> itr = list.iterator();
        while(itr.hasNext()) {
            String[] str = itr.next();
            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");
        }
        reader.close();
    }
}
