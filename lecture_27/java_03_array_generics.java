@SuppressWarnings("unchecked")
class MyArray<T> {
    T arr[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        arr[length++] = v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }

}

public class java_03_array_generics {
public static void main(String[] args) {
    MyArray at=new MyArray<>();
    at.append("hello");
    at.append("bye");
    at.append(10);
    at.display();
}
}