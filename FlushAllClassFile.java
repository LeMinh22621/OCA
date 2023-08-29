import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FlushAllClassFile {

    public static void deleteAllClassFile(File directory) {
        if (directory.isDirectory()) {
            List<File> files = Arrays.asList(directory.listFiles());
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteAllClassFile(file);
                    } else if (file.getName().endsWith(".class")){
                        if (file.delete()) {
                            System.out.println(new StringBuilder("Success deleted: ").append(file.getAbsolutePath()));
                        } else {
                            System.out.println(new StringBuilder("Error delete: ").append(file.getAbsolutePath()));
                        }
                    }
                }
            }
        }
    }
    public static void main(String... args) {
        deleteAllClassFile(new File("./"));
    }
}
