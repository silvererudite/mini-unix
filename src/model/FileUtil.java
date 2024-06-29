package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class FileUtil {
    private String parameter;
    private String filePath;

    public FileUtil(String parameter, String filePath){
        this.parameter = parameter;
        this.filePath = filePath;
    }

    public int calculateFileBytes(){
        String fileContents = getFileContents(this.filePath);
        return fileContents.getBytes().length;
    }

    private String getFileContents(String filePath){
        StringBuilder fileContents= new StringBuilder();
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileContents.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        };
        return fileContents.toString();

    }

}
