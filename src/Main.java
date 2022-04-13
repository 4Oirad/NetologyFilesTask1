import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var sb = new StringBuilder();
        File srcDir = new File("C:\\Users\\ars-b\\Desktop\\Games\\src");
        File resDir = new File("C:\\Users\\ars-b\\Desktop\\Games\\res");
        File savegamesDir = new File("C:\\Users\\ars-b\\Desktop\\Games\\savegames");
        File tempDir = new File("C:\\Users\\ars-b\\Desktop\\Games\\temp");
        if (srcDir.mkdir()) sb.append("Каталог src создан успешно\n");
        else sb.append("Каталог src не создан\n");
        if (resDir.mkdir()) sb.append("Каталог res создан успешно\n");
        else sb.append("Каталог res не создан\n");
        if (tempDir.mkdir()) sb.append("Каталог temp создан успешно\n");
        else sb.append("Каталог temp не создан\n");
        File tempFile = new File(tempDir, "temp.txt");
        try {
            if (tempFile.createNewFile()) sb.append("Файл temp.txt создан успешно\n");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            FileWriter writer = new FileWriter(tempFile);
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(sb.toString());

    }
}
