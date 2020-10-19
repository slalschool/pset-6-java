import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = 0;
        do {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
        }
        while (integer < 0 || integer > 92);

        int[]array = new int[integer];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < integer; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.print("\n" + array[integer - 1] + ".");

        input.close();
    }
}