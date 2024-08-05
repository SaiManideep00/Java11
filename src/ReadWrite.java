import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file1.txt");
        FileOutputStream fos=new FileOutputStream("file2.txt");
        //1. To copy entire file to another file
//        int x;
//        while((x= fis.read())!=-1) {
//            System.out.println((char)x);
//            fos.write(x);
//        }

        //2.To read array
        byte[] b=new byte[30];
        int y=fis.read(b,0,9);
        fos.write(b);

    }
}
