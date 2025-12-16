
class rectangle{
    public int length;
    public int breath;


    public void area(){
        System.out.println("The area is: "+length*breath);
    }
    public void perimeter(){
        System.out.println("The perimeter is: "+(2*(length+breath)));
    }
}

public class java_01_write_a_class_for_rectangle {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        r1.length=10;
        r1.breath=20;
        r1.area();
        r1.perimeter();
    }
}
