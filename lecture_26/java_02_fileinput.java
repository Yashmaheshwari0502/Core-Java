

import java.io.FileInputStream;
import java.io.IOException;

public class java_02_fileinput  {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/text.txt");
            byte []b=new byte[fis.available()];
            fis.read(b);
            String s=new String(b); 
            System.out.println(s);
            

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
