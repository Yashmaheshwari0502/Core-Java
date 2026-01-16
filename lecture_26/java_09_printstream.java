
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class java_09_printstream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/Student.txt");
        BufferedReader bs=new BufferedReader(new InputStreamReader(fis));

        Student s=new Student();
        s.roll=Integer.parseInt(bs.readLine());
        s.name=bs.readLine();
        s.dept=bs.readLine();


        System.out.println("Roll No is: "+ s.roll);
        System.out.println("Name is: "+ s.name);
        System.out.println("dept is: "+ s.dept);
    }
}
