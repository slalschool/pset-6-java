import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = 0;
        int sum = 0;

        do {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
        }
        while (integer <= 0);

        String number = Integer.toString(integer);

        for (int i = 0; i < number.length(); i++) {

            int temp = Character.getNumericValue(number.charAt(i));
            if (temp % 2 == 1) {
                sum += temp;
            }

        }
        System.out.print("\n" + sum + ".");

        input.close();
    }
}