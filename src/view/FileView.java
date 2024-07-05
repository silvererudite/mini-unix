package view;

public class FileView {
    public void displayByteCount(int byteCount, String filePath) {
        System.out.println(" " + byteCount + " " + filePath);
    }

    public void displayLineCount(int lineCount, String filePath) {
        System.out.println(" " + lineCount + " " + filePath);
    }

    public void displayUsage() {
        System.out.println("Usage: java controller.FileController -c <filename>");
    }
}
