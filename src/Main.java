import model.FileUtil;

public class Main {
    public static void main(String[] args) {

        FileUtil util = new FileUtil("ghh", "test.txt");
        System.out.println(util.calculateFileBytes());
    }
}