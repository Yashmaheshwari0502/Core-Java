import java.util.Scanner;

public class java_02_find_radix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1.
        // System.out.println("Enter the string for identifying");
        // String str=sc.nextLine();
        // if(str.matches("[01]*")){
        //     System.out.println("Binary");
        // }
        // else if(str.matches("[0-7]*")){
        //     System.out.println("Octal");
        // }
        // else if(str.matches("[0-9]*")){
        //     System.out.println("Decimal");
        // }
        // else if(str.matches("[0-9A-F]*")){
        //     System.out.println("HexaDecimal");
        // }

        // 2.
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not Leap year");
                }
            }
            else {
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not Leap year");
        }
        

        sc.close();
    }
}
