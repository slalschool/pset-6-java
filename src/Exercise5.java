import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prime = 0;
        int integer = 0;
        do {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
        }
        while (integer < 0);

        for (int i = 2; i < Math.sqrt(integer); i++) {
            if (integer % i == 0) {
                prime = i;
                break;
            }
        }

        if (prime != 0) {
            System.out.println("Not prime.");
        }

        else {
            System.out.println("Prime.");
        }

        input.close();
    }
}