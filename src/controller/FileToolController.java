package controller;

import model.FileUtil;
import view.FileView;

public class FileToolController {
    private FileUtil fileUtil;
    private FileView fileView;

    public FileToolController(FileUtil fileUtil, FileView fileView){
        this.fileUtil = fileUtil;
        this.fileView = fileView;
    }

    public void execute(String[] args){
        if(args.length != 2){
            fileView.displayUsage();
            return;
        }
        switch (args[0]) {
            case "-c" -> {
                int byteCount = fileUtil.calculateFileBytes();
                fileView.displayByteCount(byteCount, args[1]);
            }
            case "-lc" -> {
                int lineCount = fileUtil.countFileLines(args[1]);
                fileView.displayLineCount(lineCount, args[1]);
            }
            case "-w" ->{
                int wordCount = fileUtil.countFileWords(args[1]);
                fileView.displayWordCount(wordCount, args[1]);
            }
            default -> System.out.println("Ooops");
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            new FileView().displayUsage();
            return;
        }
        FileUtil model = new FileUtil(args[1]);
        FileView view = new FileView();
        FileToolController controller = new FileToolController(model, view);

        controller.execute(args);
    }

}
