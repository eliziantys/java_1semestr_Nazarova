import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Practice1 {

    public static void main(String[] args) throws IOException {

        byte[] data = {65, 66, 67};

        InputStream input = new ByteArrayInputStream(data);

        int value;

        while ((value = input.read()) != -1) {
            System.out.println((char) value);
        }

        input.close();
    }
}