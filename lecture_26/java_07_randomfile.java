
import java.io.RandomAccessFile;

public class java_07_randomfile {
    public static void main(String[] args) throws  Exception{
        RandomAccessFile rs=new RandomAccessFile("/Users/yesmadam/Desktop/Java/lecture_26/text.txt", "rw");
        System.out.println((char)rs.read());
       System.out.println((char)rs.read());
       System.out.println((char)rs.read());
       System.out.println((char)rs.read());
       System.out.println((char)rs.read());
    rs.write('v');
    rs.seek(5);
    System.out.println((char)rs.read());
    }
}
