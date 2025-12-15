
import java.util.Scanner;



public class java_05_factorial {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // 1.
        // System.out.println("Enter the value of a and d");
        // int a =sc.nextInt();
        // int d=sc.nextInt();
        // System.out.println("Enter the numbe of terms n");
        // int n =sc.nextInt();
        // System.out.println("*****************");
        // for(int i=0;i<n;i++){
        //     System.out.println(a);
        //     a=a+d;
        // }

        // 2.
        // System.out.println("Enter the value of a and r");
        // int a=sc.nextInt();
        // int r=sc.nextInt();
        // System.out.println("Enter the number of terms n");
        // int n=sc.nextInt();
        // System.out.println("*****************");
        // for(int i=0;i<n;i++){
        //     System.out.println(a);
        //     a=a*r;
        // }

        // 3.
        System.out.println("Enter the n for fibbonaci");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
