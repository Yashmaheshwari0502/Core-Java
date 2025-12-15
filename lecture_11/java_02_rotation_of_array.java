
public class java_02_rotation_of_array {

    public static void main(String[] args) {

        // 1.
        // int a[] = {1,2,3,4,5,6,7,8};
        // int temp=a[0];
        // for(int i=1;i<a.length;i++){
        //     a[i-1]=a[i];
        // }
        // a[a.length-1]=temp;
        // for(int x:a){
        //     System.out.print(x+" ");
        // }

        // 2.
        // int index=2;
        // int value=245;

        // int a[]=new int[10];
        // a[0]=10;
        // a[1]=20;
        // a[2]=30;
        // a[3]=40;
        // a[4]=50;
        // a[5]=60;

        // for(int i=6;i>=index;i--){
        //     a[i]=a[i-1];
        // }
        // a[index]=value;
        // for(int x:a){
        //     System.out.print(x+" ");
        // }

        // 3.
        int a[] = {1,2,3,4,5,6,7,8};
        int delete=3;
        for(int i=delete;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=0;
        for(int x:a){
            System.out.print(x+" ");
        }

        
    }
}