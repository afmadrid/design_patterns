package decorator.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        String InputFile = "\\src\\main\\java\\decorator\\LowerCaseInputStream\\test.txt";

        try {
            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream(InputFile)));

            while((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
