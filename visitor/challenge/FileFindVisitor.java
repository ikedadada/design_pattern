package visitor.challenge;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private List<File> foundFiles = new ArrayList<>();

    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }

}
