import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("logs.txt");
        f.createNewFile();
        File dir=new File("logs");
        dir.mkdirs();
        File destination=new File(dir,"logs.txt");
        f.renameTo(destination);
        destination.delete();
        dir.delete();
    }
}
