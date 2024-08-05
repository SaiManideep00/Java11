import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }

    }
}
