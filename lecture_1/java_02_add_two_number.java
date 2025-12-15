
import java.util.Scanner;

public class java_02_add_two_number {
    public static void main(String[] args) {
        System.out.println("Enter Number one");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        System.out.println("Enter Number two");
        b=sc.nextInt();

        c=a+b;
        System.out.println("the total is "+c);
        sc.close();

    }
}
