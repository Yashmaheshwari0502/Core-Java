
public class java_02_Rotation_of_Array_Inserting_an_Element_into_an_Array {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;

        int n = 6;

        int index = 2;
        int value = 100;

        for (int i = n; i >= index; i--) {
            a[i] = a[i - 1];
        }
        a[index]=value;

        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
