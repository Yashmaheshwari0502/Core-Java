
import java.util.Scanner;


public class java_03_cuboid {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int area=2*(l*b+b*h+h*l);
        int volume=l*b*h;
        System.out.println(volume);
        System.out.println(area);
        sc.close();
    }
}
