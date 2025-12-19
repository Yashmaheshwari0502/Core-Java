import java.util.Date;

class student{
    private String rollNo;

    private static int count=1;

    private String generateRollNo(){
        Date d =new Date();
        String  rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }

    public student() {
        rollNo=generateRollNo();
    }
    public String getrollNo(){
        return rollNo;
    }

    
}

public class java_01_student_roll_number {
    public static void main(String[] args) {
        student s1=new  student();
        System.out.println(s1.getrollNo());
        student s2=new  student();
        System.out.println(s2.getrollNo());

    }
}
