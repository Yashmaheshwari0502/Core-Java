interface  Mylambda{
    public void display(String str);
}


public class java_04_method_expression {

    public static void reverse(String str){
        StringBuffer b=new StringBuffer(str);
        b.reverse();
        System.out.println(b);
    }
    public static void main(String[] args) {
        Mylambda ml=java_04_method_expression::reverse;
        ml.display("hello");
    }
}
