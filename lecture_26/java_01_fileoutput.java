
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_01_fileoutput {
    public static void main(String[] args) {
        try {
            try (FileOutputStream fos = new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/text.txt")) {
                String str = "hello yash";
                byte b[]=str.getBytes();
                
                for(byte x:b){
                    fos.write(x);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
