class minimumBalanceException extends Exception{
public String toString(){
    return "balance can't be less than 5000";
}
}

public class java_03_user_defined_exception {
    static void func1() {
        try{
            throw new minimumBalanceException();
        }
        catch(minimumBalanceException e){
            System.out.println(e);
        }
    }

    static void func2() {
        func1();
    }

    static void func3() {
        func2();
    }

    public static void main(String[] args) {
        func3();
    }
}
