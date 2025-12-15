

public class java_01_find_second_largest_element_in_array {
    public static void main(String[] args) {
        int a[]={12,432,4,5,2,23,34353};
        int max1=-1;
        int max2=-1;
         for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2) {
                max2=a[i];
            }
         }
         System.out.println("First max is: "+max1);
         System.out.println("Second max is: "+max2);
    }
}
