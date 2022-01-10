package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            String fileName = "newfile.txt";
            String path = System.getProperty("user.dir")+"\\"+fileName;
            File file = new File(path);
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
            Random rn = new Random();
            FileWriter fw=new FileWriter(path);
            for (int i=0; i<5; i++) {
                fw.write("Entered value at line:"+i);
                fw.write("\n");
            }
            fw.close();
            File fileUtil = FileUtils.getFile(path);
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            String newPath = System.getProperty("user.dir")+"\\extras";
            File destDir = new File(newPath);
            FileUtils.copyFileToDirectory(file, destDir);

            File newFile = FileUtils.getFile(destDir, fileName);
            System.out.println("Data in new file: " + FileUtils.readFileToString(newFile, "UTF8"));
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}