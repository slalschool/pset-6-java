import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        do {
            System.out.print("Height: ");
            height = input.nextInt();
        }
        while (height <= 0 || height >= 25);

        height += 1;
        for(int i = 2; i <= height; i++){
            System.out.println();
            spaces(height, i);
            hashes(i);
        }

        input.close();
    }

    private static void spaces(int height, int number){
        for(int i = 0; i < height - number; i++){
            System.out.print(" ");
        }
    }
    private static void hashes(int number){
        for(int i = 0; i < number; i++){
            System.out.print("#");
        }
    }
}