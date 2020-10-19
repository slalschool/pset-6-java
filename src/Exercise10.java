import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int sum = 0;
        String cardNum;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        cardNum = input.nextLine();

        for(int i = cardNum.length() - 2; i >= 0; i-=2){
            int digit = 2 * Integer.parseInt(Character.toString(cardNum.charAt(i)));
            int first = digit / 10;
            int second = digit - first * 10;
            int digitSum = first + second;
            sum = sum + digitSum;
        }

        for(int i = cardNum.length() - 1; i >= 0; i -=2){
            sum += Integer.parseInt(Character.toString(cardNum.charAt(i)));
        }

        String sumStr = Integer.toString(sum);
        if(Character.toString(sumStr.charAt(sumStr.length() - 1)).equals("0")){
            int twoDigits = Integer.parseInt(cardNum.substring(0,2));
            int firstDigit = Integer.parseInt(Character.toString(cardNum.charAt(0)));

            if((twoDigits == 34 || twoDigits == 37) && cardNum.length() == 15){
                System.out.println("American Express.");
            }

            else if ((twoDigits == 51 || twoDigits == 52 || twoDigits == 53 || twoDigits == 54 || twoDigits == 55) && (cardNum.length() == 16)){
                System.out.println("Mastercard.");
            }

            else if(firstDigit == 4 && (cardNum.length() == 14 || cardNum.length() == 16)){
                System.out.println("Visa.");
            }
        }

        else{
            System.out.println("Invalid.");
        }

        input.close();

    }
}