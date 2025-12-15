
// 1.
// public class java_03_calculate_discount {

//     static void max(int ...x){
//         if(x.length==0){
//             System.out.println("max is: "+Integer.MIN_VALUE);
//         }
//         else if(x.length==1){
//             System.out.println("max is: "+x[0]);
//         }
//         else{
//             int max=-1;

//             for(int i=0;i<x.length;i++){
//                 if(x[i]>max){
//                     max=x[i];
//                 }
//             }

//             System.out.println("max is: "+max);
//         }
//     }
//     public static void main(String[] args) {
//         max();
//         max(10);
//         max(20,10);
//         max(10,20,30);
//         max(10,20,30,40);

//     }
// }

// 2.

// public class java_03_calculate_discount {

//     static int sum(int... x) {
//         int sum = 0;
//         for (int i = 0; i < x.length; i++) {
//             sum += x[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         System.out.println("sum is: " + sum(10, 20, 40, 30));
//         System.out.println("sum is: " + sum(10,  30));
//     }
// }



// 3.


public class java_03_calculate_discount {

    static double discount(int ...x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        if(sum>500){
            sum=sum-((sum/100)*15);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("discount is: "+discount(100,200,300,400));
        System.out.println("discount is: "+discount(100,300));
    }
}