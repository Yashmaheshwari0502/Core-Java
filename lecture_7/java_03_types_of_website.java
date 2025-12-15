
import java.util.Scanner;

public class java_03_types_of_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.
        // System.out.println("Enter the day");
        // int day = sc.nextInt();
        // if (day == 1) {
        //     System.out.println("Monday");
        // } else if (day == 2) {
        //     System.out.println("Tuesday");
        // } else if (day == 3) {
        //     System.out.println("Wednesday");
        // } else if (day == 4) {
        //     System.out.println("Thurday");
        // } else if (day == 5) {
        //     System.out.println("Friday");
        // } else if (day == 6) {
        //     System.out.println("Saturday");
        // } else if (day == 7) {
        //     System.out.println("Sunday");
        // }

        String str=sc.nextLine();
        int  value=str.indexOf(":");
        String ans=str.substring(0,value);
        if(ans.equals("http")){
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(ans.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        
        else if(ans.equals("net")){
            System.out.println("network");
        }

        
        

        

        sc.close();

    }
}
