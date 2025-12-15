
import java.util.Scanner;

public class java_02_Find_Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not Leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        }else{
            System.out.println("Not Leap year");
        }
        sc.close();
    }
}
