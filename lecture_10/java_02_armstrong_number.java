
import java.util.Scanner;

public class java_02_armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        int temp=a;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int temp2=a;
        int sum=0;
        while(temp2>0){
            int v=temp2%10;
            sum=sum+Math.powExact(v, count);
            temp2=temp2/10;
        }
        if(sum==a){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }

}