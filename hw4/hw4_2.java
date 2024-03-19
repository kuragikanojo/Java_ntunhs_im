import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class hw4_2 {
    
    public static void main(String[] args) {

        Path filePath = Path.of("D:/Java_ntunhs_im/demo.txt");
        try{
            String content = Files.readString(filePath);
            System.out.println(content);

        }catch(IOException e){

            e.printStackTrace();
        }

    }
}
