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
        if(args[0].equals("-c")) {
            int byteCount = fileUtil.calculateFileBytes();
            fileView.displayByteCount(byteCount, args[1]);
        } else if (args[0].equals("-lc")) {
            int lineCount = fileUtil.countFileLines(args[1]);
            fileView.displayLineCount(lineCount, args[1]);
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
