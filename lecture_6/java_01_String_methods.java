

public class java_01_String_methods {

    public static void main(String[] args) {
        // String name="programmer@gmail.com";
        // if(name.contains("gmail.com")==true){
        //     System.out.println("Gmail");
        // }
        // else{
        //     System.out.println("Not a Gmail");
        // }

        String name="programmer@gmail.com";
        String username=name.substring(0,name.indexOf("@"));
        String domain=name.substring(name.indexOf("@")+1);
        System.out.println(username);
        System.out.println(domain);
    }
    
}