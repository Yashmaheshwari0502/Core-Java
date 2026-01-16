import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class java_12_serialize_a_customer {
    public static void main(String[] args) throws Exception {

        float List[] = {1.2f, 2.4f, 43.5f};

        FileOutputStream fos = new FileOutputStream("/Users/yesmadam/Desktop/Java/lecture_26/value.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // Write length correctly
        dos.writeInt(List.length);

        for (float f : List) {
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/yesmadam/Desktop/Java/lecture_26/value.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;

        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }
}
