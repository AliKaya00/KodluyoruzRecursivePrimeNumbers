import java.util.Scanner;

public class RecursivePrime {


    static boolean primeNumber(int number) {
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = true;
            }

        }
        return result;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int number = scanner.nextInt();
        if (primeNumber(number) == false) {
            System.out.print("is a prime number!");
        } else {
            System.out.print("is not a prime number!");
        }
    }
}