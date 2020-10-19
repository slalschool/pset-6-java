import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int number = -1;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        }
        while(number <= 0);

        String strNumber = Integer.toString(number);
        char[] array = strNumber.toCharArray();

        for (int i = 0; i < array.length/2; i ++) {
            int temp = Character.getNumericValue(array[i]);
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = Character.forDigit(temp, 10);
            temp ++;
        }

        for (int i = 0; i < array.length - 1; i ++) {
            System.out.print(array[i] + ", ");
        }

        System.out.print(array[array.length - 1] + ".");

        input.close();
    }
}