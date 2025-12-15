
import java.util.Scanner;

public class java_01_factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.
        // System.out.println("Enter the number for table");
        // int a=sc.nextInt();

        // for(int i=1;i<=10;i++){
        // System.out.printf("%d X %d = %d\n",a,i,a*i);
        // }

        // 2.
        // System.out.println("Enter the n");
        // int b = sc.nextInt();
        // int sum = 0;
        // for (int i = 0; i <= b; i++) {
        //     sum += i;
        // }
        // System.out.println("the sum is: " + sum);


        // 3.
        System.out.println("Enter the number");
        int c=sc.nextInt();
        int sum=1;
        for(int i=1;i<=c;i++){
            sum*=i;
        }
        System.out.println(" the factorial is "+sum);
        sc.close();
    }
}
