



interface MyLambda{
    public int add(int x, int b);
}

interface My2{
    public int add2(int x,int b);
}
public class java_02_lambda_parameter {
    public static void main(String[] args) {
        MyLambda m=(a,b)-> a+b;
        int r=m.add(10, 20);
        System.out.println(r);

        MyLambda m2=(a,b)-> a+b;
        int r2=m.add(10, 20);
        System.out.println(r);

        
    }
}
