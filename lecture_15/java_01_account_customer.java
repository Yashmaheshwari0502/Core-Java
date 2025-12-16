
// 1.
// class Account {

//     private static int count = 1000;
//     private int accountNo;
//     private String name;
//     private String address;
//     private int phoneNo;
//     protected int balance = 0;
//     private String dob;

//     public Account(String name, String address, String dob, int phoneNo) {
//         this.accountNo = count++;
//         this.name = name;
//         this.address = address;
//         this.dob = dob;
//         this.phoneNo = phoneNo;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getBalance() {
//         return balance;
//     }
// }

// class SavingAccount extends Account {

//     public SavingAccount(String name, String address, String dob, int phoneNo) {
//         super(name, address, dob, phoneNo);
//     }

//     public void deposit(int amount) {
//         balance += amount;
//     }

//     public void withdraw(int amount) {
//         if (amount <= balance) {
//             balance -= amount;
//         } else {
//             System.out.println("Insufficient balance");
//         }
//     }
// }

// class LoanAccount extends Account {

//     public LoanAccount(String name, String address, String dob, int phoneNo) {
//         super(name, address, dob, phoneNo);
//     }

//     public void takeLoan(int amount) {
//         balance += amount;
//     }

//     public void payEmi(int amount) {
//         if (amount <= balance) {
//             balance -= amount;
//         } else {
//             balance = 0;
//         }
//     }
// }

// public class java_01_account_customer {

//     public static void main(String[] args) {

//         // Saving Account
//         SavingAccount sa = new SavingAccount(
//                 "Yash", "Vaishali", "5 December", 9650700);

//         sa.deposit(2000);
//         sa.withdraw(500);

//         System.out.println("Saving Account Holder: " + sa.getName());
//         System.out.println("Saving Account Balance: " + sa.getBalance());

//         System.out.println("--------------------------------");

//         // Loan Account
//         LoanAccount la = new LoanAccount(
//                 "Yash", "Vaishali", "5 December", 9650700);

//         la.takeLoan(50000);   // loan taken
//         System.out.println("Loan Amount Taken: " + la.getBalance());

//         la.payEmi(10000);    // EMI payment
//         System.out.println("Loan Balance After EMI: " + la.getBalance());

//         la.payEmi(15000);    // another EMI
//         System.out.println("Loan Balance After EMI: " + la.getBalance());
//     }
// }

// 2. cell phone

// class cellPhone {
//     private int phoneNO;
//     private int imie;

//     public void call(int number) {
//         System.out.println("calling.... " + number);
//     }

//     public void sms(int number, String message) {
//         System.out.print("Your message is send to ... " + number);
//     }

//     public void saveContact(int number) {
//         System.out.println("Contact saved");
//     }

//     public void deleteContact(int number) {
//         System.out.println("Contact deleted");
//     }

// }

// class SmartPhone extends cellPhone {
//     private int macNo;

//     public void play() {
//         System.out.println("video Playing");
//     }

//     public void click() {
//         System.out.println("phone clicked");
//     }

//     public void capture() {
//         System.out.println("image clicked");
//     }
// }

// public class java_01_account_customer {
//     public static void main(String[] args) {
//         SmartPhone st = new SmartPhone();
//         st.call(1000);
//         st.sms(10000, "hello beautiful");
//     }
// }

// 3.
class Customer {
    private String name;
    private int phoneNo;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void paybill() {
        System.out.println("paying bill");
    }
}

class Member extends Customer {
    private int custId;
    private String address;
    private String dob;

    private void callBack() {
        System.out.println("Calling callback");
    }
}

public class java_01_account_customer {
public static void main(String[] args) {
    Member m1=new Member();
    m1.setName("yash");
    System.out.println(m1.getName());

}
}