
public class java_04_display_number_in_words {

    public static void main(String[] args) {
        int n = 1700;
        String sum = "";
        while (n > 0) {
            int v = n % 10;
            sum = sum + v;
            n = n / 10;
        }

        for (int i = sum.length()-1; i >= 0; i--) {
            int a = sum.charAt(i)-'0';

            switch (a) {
                case 0: {
                    System.out.println("Zero");
                    break;
                }
                case 1: {
                    System.out.println("One");
                    break;
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                case 6: {
                    System.out.println("Six");
                    break;
                }
                case 7: {
                    System.out.println("Seven");
                    break;
                }
                case 8: {
                    System.out.println("Eight");
                    break;
                }
                case 9: {
                    System.out.println("Nine");
                    break;
                }
            }
        }

    }
}