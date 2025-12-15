
import java.util.Scanner;

public class java_04_day_in_words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.

        // int a=sc.nextInt();
        // switch(a){
        // case 1:{
        // System.out.println("Monday");
        // break;
        // }
        // case 2:{
        // System.out.println("Tuesday");
        // break;
        // }
        // case 3:{
        // System.out.println("Wednesday");
        // break;
        // }
        // case 4:{
        // System.out.println("Thurday");
        // break;
        // }
        // case 5:{
        // System.out.println("Friday");
        // break;
        // }
        // case 6:{
        // System.out.println("Saturday");
        // break;
        // }
        // case 7:{
        // System.out.println("Sunday");
        // break;
        // }
        // }

        // 2.

        // int month = sc.nextInt();
        // switch (month) {
        //     case 1: {
        //         System.out.println("Month is January");
        //         break;
        //     }
        //     case 2: {
        //         System.out.println("Month is Febuary");
        //         break;
        //     }
        //     case 3: {
        //         System.out.println("Month is March");
        //         break;
        //     }
        //     case 4: {
        //         System.out.println("Month is April");
        //         break;
        //     }
        //     case 5: {
        //         System.out.println("Month is May");
        //         break;
        //     }
        //     case 6: {
        //         System.out.println("Month is June");
        //         break;
        //     }
        //     case 7: {
        //         System.out.println("Month is July");
        //         break;
        //     }
        //     case 8: {
        //         System.out.println("Month is August");
        //         break;
        //     }
        //     case 9: {
        //         System.out.println("Month is September");
        //         break;
        //     }
        //     case 10: {
        //         System.out.println("Month is October");
        //         break;
        //     }
        //     case 11: {
        //         System.out.println("Month is November");
        //         break;
        //     }
        //     case 12: {
        //         System.out.println("Month is December");
        //         break;
        //     }
        // }


        // 3.

        String value=sc.nextLine();
        int ans=value.lastIndexOf(".");
        String domain=value.substring(ans+1);
        
        switch(domain){
            case "com":{
                System.out.println("Commercial");
                break;
            }
            case "org":{
                System.out.println("Organizational");
                break;
            }
            case "net":{
                System.out.println("network");
                break;
            }
        }
    

        sc.close();
    }
}