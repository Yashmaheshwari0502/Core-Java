
import java.util.Scanner;

class java_01_calculate_area {
    public static void main(String[] args) {
        // System.out.println("Enter value of height");
        // Scanner sc=new Scanner(System.in);
        // int h=sc.nextInt();
        // System.out.println("Enter value of base");
        // int b=sc.nextInt();

        // System.out.println("the area of right anlge traingle is "+(h*b)/2);

        // System.out.println("Enter value of a b and c");

        // Scanner sc = new Scanner(System.in);

        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float c = sc.nextFloat();
        // float s=(a+b+c)/2;
        // System.out.println(s);
        // sc.close();


        System.out.println("Enter the value of a b c ");
        Scanner sc=new Scanner(System.in);  

        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float s=(a+b+c)/2;
        float value=(s)*(s-a)*(s-b)*(s-c);
        float area=(float) Math.sqrt(value);
    System.out.println(area);
        sc.close();
    }
}