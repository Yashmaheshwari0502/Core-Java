
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class java_05_bufferinput  {
    public static void main(String[] args) throws  Exception {
        FileInputStream fis=new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/destination.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
       

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        bis.mark(10);
         System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
         System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

    }
}
