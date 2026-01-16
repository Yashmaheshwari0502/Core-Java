
public class java_01_generics<T> {

    T data[] =(T[]) new Object[3];
    public static void main(String[] args) {
        java_01_generics<String> gd=new java_01_generics<>();
        gd.data[0]="hello";
        gd.data[1]="welcome";
        gd.data[2]="yellow";

        String st=gd.data[2];
        
    }
}
