import mypack1.demo1;

public class test {
    public static void main(String[] args) {
        demo1 obj = new demo1();
        System.out.println(obj.a); // public access
        System.out.println(obj.b); // protected access
        System.out.println(obj.c); // default access
        System.out.println(obj.d); // private access - not accessible
        // accessing method to display all values
    }
}
