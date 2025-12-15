
import java.util.Scanner;

public class java_02_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        // int n = 64332452;
        // int sum = 0;
        // while (n > 0) {
        // int v = n % 10;
        // sum = (sum * 10) + v;
        // n = n / 10;
        // }
        // while(sum>0){
        // int v=sum%10;
        // System.out.println(v);
        // sum=sum/10;
        // }

        // 2.
        // int n=45;
        // int count=0;
        // while(n>0){
        // n=n/10;
        // count++;

        // }
        // System.out.println(count);

        // 3.
        // int n=1643;
        // int temp=n;
        // int temp2=n;
        // int count=0;
        // while(n>0){
        // n=n/10;
        // count++;
        // }
        // int sum=0;
        // while(temp>0){
        // int v=temp%10;
        // sum=sum + Math.powExact(v, count);
        // temp=temp/10;

        // }
        // if(temp2==sum){
        // System.out.println("Armstrong");
        // }else{
        // System.out.println("Not Armstrong");
        // }

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
