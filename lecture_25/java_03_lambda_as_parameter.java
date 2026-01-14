

interface MyLambda{
    public void display();
}

class UseLambda{
    public void calllambdsa(MyLambda ml){
        ml.display();
    }
}

class Demo{
    public void method1(){
        UseLambda ul=new UseLambda();
        ul.calllambdsa(()->{System.out.println("hello");});
    }
}

public class java_03_lambda_as_parameter {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
}
