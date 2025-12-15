package mypack1;
import mypack1.demo1;

public class test4 extends demo1 {
    public void printValues() {
        System.out.println(a); // public access
        System.out.println(b); // protected access
        System.out.println(c); // default access - not accessible
        System.out.println(d); // private access - not accessible
    }
    
}