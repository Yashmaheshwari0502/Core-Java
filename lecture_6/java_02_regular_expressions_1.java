
public class java_02_regular_expressions_1 {
    public static void main(String[] args) {
        int value = 1010101010;
        String ans = String.valueOf(value);
        System.out.println(ans.matches("[0-1]*"));


        String value1="2340AB";

        System.out.println(value1.matches("[0-9A-F]+"));


        String value2="05/10/2025";
        System.out.println(value2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


    }
}
