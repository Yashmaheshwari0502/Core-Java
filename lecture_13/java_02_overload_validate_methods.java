
// 1.

// public class java_02_overload_validate_methods {

//     static int area(int l ,int b){
//         return l*b;
//     }
//     static float area(float l, float  b){
//         return l*b;
//     }

//     static double area(double r){
//         return Math.PI *r*r;
//     }

//     public static void main(String[] args) {
//         int l=10;
//         int b=20;
//         int r=30;

//         area(l,b);
//         area(20f,20f);
//         area(r);
//     }
// }

// 2.

// public class java_02_overload_validate_methods {

//     static void reverse(int a) {
//         int temp = a;
//         int ans = 0;
//         while (temp > 0) {
//             int x = temp % 10;
//             ans = (ans * 10) + x;
//             temp = temp / 10;
//         }
//         System.out.println("reversed Number: " + ans);
//     }

//     static void reverse(int a[]) {
//         int l = 0;
//         int r = a.length - 1;

//         while (l < r) {
//             int temp = a[l];
//             a[l] = a[r];
//             a[r] = temp;
//             l++;
//             r--;
//         }

//         for(int x:a){
//             System.out.print(x+" ");
//         }
//     }

//     public static void main(String[] args) {
//         int a = 2345;
//         int arr[] = { 1, 2, 3, 4, 5 };
//         reverse(a);
//         reverse(arr);
//     }
// }



// 3.


 
 public class java_02_overload_validate_methods {

    static void validate(String name){
        if(name.matches("[a-zA-z\\s]+")){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Not Valid Name");
        }
    }

    static void validate(int age){
        if(age>18){
            System.out.println("valid Age");
        }
        else{
            System.out.println("Not valid Age");
        }
    }

 
    public static void main(String[] args) {
        String name="yash maheshwari ";
        int age =23;

        validate(age);
        validate(name);
    }
 }