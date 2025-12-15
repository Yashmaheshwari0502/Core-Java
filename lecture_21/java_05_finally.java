public class java_05_finally {


    static void meth1() throws Exception{
        try{
            throw new Exception("no error");
        }
        finally{
            System.out.println("finally");
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}
