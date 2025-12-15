
public class java_04_sum_of_numbers_from_commandline {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);

        }
        System.out.println("The sum is: " + sum);
    }
}
