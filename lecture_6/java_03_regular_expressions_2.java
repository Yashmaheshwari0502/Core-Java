
public class java_03_regular_expressions_2 {
    public static void main(String[] args) {
        // String abc="a%b$$^%&*($b^%*^(&**^c";
        // System.out.println(abc.replaceAll("[^a-zA-Z0-9]", ""));


        // String value="df fafdfd sdfdsfds";
        // System.out.println(value.replaceAll(" ", ""));

        String value="     sfdjd    fdl   jfd     ";

        value=value.replaceAll("\\s+"," ").trim();
        String match[]=value.split("\\s");
        System.out.println(match.length);
        }
}
