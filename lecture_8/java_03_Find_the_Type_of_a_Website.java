
import java.util.Scanner;



public class java_03_Find_the_Type_of_a_Website {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website");
        String a=sc.nextLine();
        String value=a.substring(0,a.indexOf(":"));
        if(value.equals("http")){
            System.out.println("Hpper Text Markup Language");
        }
        else if(value.equals("ftp")){
            System.out.println("File Transfer protocol");
        }
        else if(value.equals("net")){
            System.out.println("Network");
        }
        
        sc.close();
    }
}