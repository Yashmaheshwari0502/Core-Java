// 1.


// import java.util.Scanner;

// public class java_01_find_prime_number {

//     static void checkPrime(int n) {
//         boolean bool = false;
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 bool = true;
//             }
//         }
//         if (bool) {
//             System.out.println("Not Prime Number");
//         } else {
//             System.out.println("Prime Number");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         System.out.println("Enter the number");
//         int n = sc.nextInt();

//         checkPrime(n);
//         sc.close();
//     }
// }



// 2.


// import java.util.Scanner;

// public class java_01_find_prime_number {


//     static void checkGcd(int n,int v){
//         int i=2;
//         int max=-1;
//         while(i<=n || i<=v){
//             if(n%i==0 && v%i==0){
//                 max=i;
//             }
//             i++;
//         }
//         System.out.println("Gcd is: "+max);
//     }
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         System.out.println("Enter the numbers");
//         int n = sc.nextInt();
//         int v=sc.nextInt();

//         checkGcd(n,v);
//         sc.close();
//     }
// }

public class java_01_find_prime_number {

    static void checkMax(int a[]){
        int max=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The max element is: "+max);
    }

    
    

    public static void main(String[] args) {
        int a[]={1,2,300,4,5,6,7};

        checkMax(a);
    }
}