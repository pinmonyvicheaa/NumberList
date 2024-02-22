import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int numInt = scanner.nextInt();
        int[] number = new int[numInt];
        System.out.println("Enter " + numInt + " integers:");
        for (int i = 0; i < numInt; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("The input numbers are:");
        for (int i = 0; i < numInt; i++) {
            System.out.println((i + 1) + ". " + number[i]);
        }
    }
}