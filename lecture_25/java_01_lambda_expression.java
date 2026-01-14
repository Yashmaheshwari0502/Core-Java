interface MyLambda {
    public void display();
}

public class java_01_lambda_expression {
    public static void main(String[] args) {
        MyLambda m = () -> { System.out.println("Hello world");};
        m.display();
    }
}
