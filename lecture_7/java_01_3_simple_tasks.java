
import java.util.Scanner;

public class java_01_3_simple_tasks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1.
        System.out.println("Enter the number to check odd even");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // 2.
        System.out.println("Enter age to check young or old");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Not Young");
        }
        else{
            System.out.println("Young");
        }
    

        // 3.
        System.out.println("Enter the marks of subjects");
        int marks =sc.nextInt();
        if(marks>=90){
            System.out.println("A Grade");
        }
        else if(marks<=89 && marks>=80){
            System.out.println("B Grade");
        }
        else if(marks <=79 && marks >=70 ){
            System.out.println("C Grade");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
