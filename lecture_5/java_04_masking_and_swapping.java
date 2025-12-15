// public class java_04_masking_and_swapping {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println("The value of a before swap: " + a);
//         System.out.println("The value of b before swap: " + b);
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.println("The value of a after swap: " + a);
//         System.out.println("The value of b after swap: " + b);

//     }
// }

public class java_04_masking_and_swapping {

    public static void main(String[] args) {
        byte a = 9;
        byte b = 12;
        byte c;

        c = (byte) (a << 4);
        c = (byte)(c | b);
        System.out.println((c&0b00001111));

    }
}