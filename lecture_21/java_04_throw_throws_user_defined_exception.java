public class java_04_throw_throws_user_defined_exception {

    static class NegativeDimension extends Exception {
        public String toString() {
            return "the value of rectangle can't be negative";
        }
    }
    static int area(int a, int b) throws NegativeDimension{
        if(a<0 || b<0)
            throw new NegativeDimension();

        int x=a*b;
        return x;
    }

    static void meth3() throws NegativeDimension{
        int a=area(-10, 10);
        System.out.println(a);
    }

    public static void main(String[] args) {
        try{
            meth3();
        }
        catch(NegativeDimension e){
            System.out.println(e);
        }
    }
}
