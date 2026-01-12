public class java_02_wrapper {
    public static void main(String[] args) {
        int j=10;
        Integer i=Integer.valueOf(j);
        int b=i;
        int c=i.intValue();
        System.out.println(b);
        System.out.println(c);
    }
}
