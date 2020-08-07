package File;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
//        return false;
        if(pathname.isDirectory()){
            return true;
        }else {
            return pathname.getName().endsWith(".java");
        }

    }
}
