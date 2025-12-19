class outer {
    int x = 10;

    class inner {
        int y = 20;

        void innerDisplay() {
            System.out.println(y);
            System.out.println(x);
        }
    }

    void outerDisplay() {
        inner in = new inner();
        in.innerDisplay();
    }
}

public class java_01_nested_inner_class {
    public static void main(String[] args) {
        // outer ot = new outer();
        // ot.outerDisplay();

        outer.inner otit=new outer().new inner();
        otit.innerDisplay();
       
    }
}
