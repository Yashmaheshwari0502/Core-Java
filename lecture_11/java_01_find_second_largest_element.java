
public class java_01_find_second_largest_element {
    public static void main(String[] args) {

        // 1.
        // int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        //     sum += a[i];
        // }
        // System.out.println("The sum is: " + sum);


        // 2.
        // int n=10;
        // int a[]={1,2,3,4,4,5,5,0,6,7,7,8,};
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==n){
        //         System.out.println("found");
        //     }
        // }

        // 3.
        // int max=-1;
        // int a[]={1,2,4,2,42,2,4,24,24,2,4,2242,4,4,42};
        // for(int i=0;i<a.length;i++){
        //     if(a[i]>max){
        //         max=a[i];
        //     }
        // }
        // System.out.println("The max is "+max);


        // 4.
        int a[]={1,2,3,4,5,6,7,8,1234567,34323};
        int max=-1;
        int max2=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("The max is "+max);
        System.out.println("The second max is "+max2);

    }
}
