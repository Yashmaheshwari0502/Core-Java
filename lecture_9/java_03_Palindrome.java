
import java.util.Scanner;

public class java_03_Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4.
        // int n=23456;
        // int sum=0;

        // while(n>0){
        // int v=n%10;
        // sum=(sum*10)+v;
        // n=n/10;
        // }
        // System.out.println("reversed number: "+sum);

        // 5.
        int n = 151;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int v = n % 10; 
            sum = (sum * 10) + v;
            n = n / 10;

        }
        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
