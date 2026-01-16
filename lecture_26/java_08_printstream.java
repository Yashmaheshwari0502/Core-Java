
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
    int roll;
    String name;
    String dept;
}

public class java_08_printstream {
    public static void main(String[] args) throws  Exception {
        FileOutputStream fos=new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/Student.txt");
        PrintStream ps=new PrintStream(fos);

        Student s=new Student();
        s.roll=10;
        s.name="yashsds";
        s.dept="ics";

        ps.println(s.roll);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
}
