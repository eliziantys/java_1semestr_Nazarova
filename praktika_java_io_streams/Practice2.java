import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Practice2 {

    public static void main(String[] args) throws IOException {

        OutputStream output = new ByteArrayOutputStream();

        output.write(65);
        output.write(66);
        output.write(67);

        output.close();

        System.out.println("Байты записаны");
    }
}