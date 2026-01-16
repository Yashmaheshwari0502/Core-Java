
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements  Serializable{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data=10;
    public transient  int t;

    public Student(){
    }

    public Student(int r,String n,float a ,String d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
    }
    public String toString(){
        return "Student{" +
            "rollno=" + rollno +
            ", name='" + name + '\'' +
            ", avg=" + avg +
            ", dept='" + dept + '\'' +
            ", data=" + data +
            ", t=" + t +
            '}';    
    }
}

// public class java_11_serializaiton {
//     public static void main(String[] args) throws  Exception {
//         FileOutputStream fos=new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/student3.txt");
//         ObjectOutputStream os=new ObjectOutputStream(fos);


//         Student s=new Student(10,"john",89.4f,"cse");

//         os.writeObject(s);
//         fos.close();
//         os.close();

//     }
// }


public class java_11_serializaiton {

    public static void main(String[] args) throws  Exception {
        FileInputStream fis=new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/student3.txt");
        ObjectInputStream os=new ObjectInputStream(fis);


        Student s=(Student)os.readObject();

        System.out.println(s);

    }
}