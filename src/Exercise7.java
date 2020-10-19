import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output = "";
        int integer = 0;
        do {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
        }
        while (integer <= 0);

        for (int i = 1; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                output = output + Integer.toString(i) + ", " + Integer.toString(integer/i) + ", ";
            }
        }

        output = output.substring(0, output.length() - 2);
        System.out.println("\n" + output + ".");

        input.close();
    }
}