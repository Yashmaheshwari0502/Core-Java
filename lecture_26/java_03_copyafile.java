
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_03_copyafile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/source1.txt");
            FileOutputStream fos=new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/source2.txt");
            
            int b;
            while((b=fis.read())!=-1){
                if(b>=65 && b<=90){
                    fos.write(b+32);
                }
                else{
                    fos.write(b);
                }
            }

            

            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
