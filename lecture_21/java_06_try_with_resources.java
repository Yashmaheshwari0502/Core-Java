import java.io.*;
import java.util.Scanner;

public class java_06_try_with_resources {

    static void meth1() throws Exception {

        try (FileInputStream f1 = new FileInputStream("/Users/yesmadam/Desktop/Java/java_06_test.text");
                Scanner sc = new Scanner(f1)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
            System.out.println(a/c);
        }

    }

    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
