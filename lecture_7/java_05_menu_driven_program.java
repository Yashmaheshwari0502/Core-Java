


import java.util.Scanner;

public class java_05_menu_driven_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter two values");
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Option");
        String value = sc.nextLine();
        switch (value.toLowerCase()) {
            case "add": {
                System.out.println("ADD is " + (a + b));
                break;
            }
            case "substract": {
                System.out.println("Substract is " + (a - b));
                break;
            }
            case "multiply": {
                System.out.println("Multiply is " + (a * b));
                break;
            }
            case "divide": {
                System.out.println("Divide is " + (a / b));
                break;
            }
        }

        sc.close();
    }
}
