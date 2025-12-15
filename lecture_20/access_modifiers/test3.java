package mypack1;
import mypack1.demo1;

public class test3 {
    demo1 obj = new demo1();
    public void displayValues() {
        System.out.println(obj.a); // public access
        System.out.println(obj.b); // protected access - not accessible
        System.out.println(obj.c); // default access - not accessible
        System.out.println(obj.d); // private access - not accessible
    }
}
