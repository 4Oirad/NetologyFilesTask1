import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        createDir("C:\\Games\\src", "src");
        createDir("C:\\Games\\res", "res");
        createDir("C:\\Games\\savegames", "savegames");
        File tempDir = createDir("C:\\Games\\temp", "temp");
        File mainDir = createDir("C:\\Games\\src\\main", "main");
        createDir("C:\\Games\\src\\test", "test");
        createFile(mainDir, "Main.java");
        createFile(mainDir, "Utils.java");
        createDir("C:\\Games\\res\\drawables", "drawables");
        createDir("C:\\Games\\res\\vectors", "vectors");
        createDir("C:\\Games\\res\\icons", "icons");
        File tempFile = createFile(tempDir, "temp.txt");
        try {
            FileWriter writer = new FileWriter(tempFile);
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static File createDir(String dir, String dirName) {
        File file = new File(dir);
        if (file.mkdir()) {
            sb.append("Каталог " + dirName + " создан успешно\n");
        } else {
            sb.append("Каталог " + dirName + " не создан\n");
        }
        return file;
    }

    static File createFile(File file, String fileName) {
        File file1 = new File(file, fileName);
        try {
            if (file1.createNewFile()) sb.append("Файл " + fileName + " создан успешно\n");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return file1;
    }
}