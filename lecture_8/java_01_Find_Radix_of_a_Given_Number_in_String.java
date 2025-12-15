
import java.util.Scanner;



public class java_01_Find_Radix_of_a_Given_Number_in_String {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        if(a.matches("[01]+")){
            System.out.println("Binary");
        }
        else if (a.matches("[0-7]+")){
            System.out.println("Octal");
        }
        else if (a.matches("[0-9]+")){
            System.out.println("Decimal");
        }
        else if(a.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal");
        }
        sc.close();
    }
}
