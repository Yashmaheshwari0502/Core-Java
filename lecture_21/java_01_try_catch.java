
// public class java_01_try_catch {
//     public static void main(String[] args) {
        
//         int a, b, c;
//         try{
//             a = 10;
//         b = 0;
//         c = a / b;
//         System.out.println(c);
//         }catch(ArithmeticException e){
//             System.out.println("Please Check this error "+e);
//         }
//         System.out.println("bye");
        
//     }
// }




import java.util.Scanner;

public class java_01_try_catch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter Second value");
        b=sc.nextInt();
        try{
            c=a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("denominator should not be zero");
        }
        System.out.println("bye");
        sc.close();

    }
}
