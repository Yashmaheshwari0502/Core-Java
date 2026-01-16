
// import java.io.DataOutputStream;
// import java.io.FileOutputStream;

// class Student {
//      String name;
//      float avg;
//      int roll;
// }

// public class java_10_datainput_data_output {
//     public static void main(String[] args) throws Exception{
//         FileOutputStream fos=new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/student2.txt");
//         DataOutputStream dos=new DataOutputStream(fos);
        
//         Student s=new Student();
//         s.name="yash";
//         s.avg=23.4f;
//         s.roll=10;

//         dos.writeUTF(s.name);
//         dos.writeInt(s.roll);
//         dos.writeFloat(s.avg);

//         dos.close();
//         fos.close();


//     }
// }




import java.io.DataInputStream;
import java.io.FileInputStream;

class Student {
     String name;
     float avg;
     int roll;
}

public class java_10_datainput_data_output {
    public static void main(String[] args) throws Exception{
        FileInputStream fos=new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/student2.txt");
        DataInputStream dis=new DataInputStream(fos);
        
        Student s=new Student();
        s.name=dis.readUTF();
        s.avg=dis.readFloat();
        s.roll=dis.readInt();

        
        System.out.println(s.name);
        System.out.println(s.avg);
        System.out.println(s.roll);
        dis.close();
        fos.close();


    }
}
