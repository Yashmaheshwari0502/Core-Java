

class Atm {

   synchronized  public void checkBalance(String name) {
        System.out.println(name + "checking balance");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

    }

    synchronized public void withdraw(String name) {
        System.out.println(name + "withdrawing Money");
try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

class Customer extends Thread {
    Atm atm;
    String name;
    int amount;

    public Customer(Atm a, String n, int am) {
        atm = a;
        name = n;
        amount = am;
    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name);
    }
    public void run(){
        useAtm();
    }
}

public class java_06_atm_machine {
public static void main(String[] args) {
    Atm at=new Atm();
    Customer c1=new Customer(at, "yash", 1000);
    Customer c2=new Customer(at, "ravi", 2000);
    
    c1.start();    
    c2.start();
}
}
