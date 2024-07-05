import model.FileUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("in args " + Arrays.toString(args));
        FileUtil util = new FileUtil("test.txt");
        System.out.println(util.calculateFileBytes());

        System.out.println(util.countFileLines("test.txt"));
    }
}