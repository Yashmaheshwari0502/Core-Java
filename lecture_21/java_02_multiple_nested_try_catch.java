
// public class java_02_multiple_nested_try_catch {
//     public static void main(String[] args) {
//         try {
//             int a[] = { 10, 20, 0, 30, 40 };
//             int c = a[1] / a[0];
//             System.out.println(c);
//             System.out.println(a[10]);
//         } catch (ArithmeticException e) {
//             System.out.println("0");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("1");
//         }

//     }
// }

public class java_02_multiple_nested_try_catch {
    public static void main(String[] args) {
        int a[] = { 10, 0, 20, 30 };
        try {
            
            try {
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bound");
            }
            int c = a[2] / a[0];
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("divisor 0");
        }
    }

}