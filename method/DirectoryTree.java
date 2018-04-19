package method;

import java.io.File;
import java.io.IOException;

public class DirectoryTree {
    public static void directoryTree(String path) throws IOException {
        File directory = new File(path);
        if (!directory.exists()) {
            System.out.println("Folder "+ path + "does not exist");
        }
        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            if (list != null) {
                for (File f: list) {
                    System.out.println(f.getCanonicalPath());
                    directoryTree(f.getCanonicalPath());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        directoryTree("D:\\codegym\\NewFolder");
    }
}
