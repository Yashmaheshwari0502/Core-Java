import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class java_04_copyfiletodestination {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/source1.txt");
            FileInputStream fis2 = new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/source2.txt");

            FileOutputStream fos=new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/destination.txt");
            SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
            int b;
            while((b=sis.read())!=-1){
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();
        }  catch (IOException e) {
            System.out.println(e);
        }

    }
}
