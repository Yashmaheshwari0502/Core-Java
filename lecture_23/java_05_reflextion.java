
import java.lang.reflect.Field;

class My {
    private int a;
    protected int b;
    public int c;
    int d;
    public My(){}

    public My(int x,int y){}

    public void display(String x1,String x2){}
    public int show(int x, int y){return 0;}
}

public class java_05_reflextion {
    public static void main(String[] args) {
        Class c=My.class;
        Field f1[]=c.getDeclaredFields();
        for(Field f:f1){
            System.out.println(f);
        }
    }
}
