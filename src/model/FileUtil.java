package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    private String parameter;
    private String filePath;

    public FileUtil(String parameter, String filePath){
        this.parameter = parameter;
        this.filePath = filePath;
    }

    public int calculateFileBytes(){
        File fileContents = new File(this.filePath);;
        return (int) fileContents.length();
    }

    public  int getFileLines(){
        return countFileLines(this.filePath);
    }


    private int countFileLines(String filePath){
        StringBuilder fileContents= new StringBuilder();
        int lineCount = 0;
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //fileContents.append(data);
                lineCount++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        };
        //return fileContents.toString();
        return lineCount;

    }

}
