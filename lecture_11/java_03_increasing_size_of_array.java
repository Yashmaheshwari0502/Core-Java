
public class java_03_increasing_size_of_array {
    public static void main(String[] args) {

        // 1.
        // int []a={1,2,3,4,5,6,7,8,9,20};
        // int []b=new int[10];
        // for(int i=0;i<a.length;i++){
        // b[i]=a[i];
        // }
        // for(int x:b){
        // System.out.print(x+" ");
        // }

        // 2.
        // int []a={1,2,3,4,5,6,7,8,9,20};
        // int []b=new int[10];
        // for(int i=0,j=a.length-1;i<a.length && j>=0;i++,j--){
        // b[j]=a[i];
        // }
        // for(int x:b){
        // System.out.print(x+" ");
        // }

        // 3.
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = new int[10];
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        b = null;

        System.out.println(a.length);

    }
}
