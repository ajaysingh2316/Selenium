package seleniumbasics;

import java.util.Scanner;

public class Assesment3 {

    public static int multiplyDigits(int n) {
        int result = 1;
        while (n != 0) {
            result *= n % 10;
            n /= 10;
        }
        return result;
    }

    public static int multiplicativePersistence(int num) {
        int persistence = 0;
        while (num >= 10) {
            num = multiplyDigits(num);
            persistence++;
        }
        return persistence;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int additivePersistence(int num) {
        int persistence = 0;
        while (num >= 10) {
            num = sumDigits(num);
            persistence++;
        }
        return persistence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result1 = multiplicativePersistence(number);
        int result2 = additivePersistence(number);
        System.out.println("The additive persistence of " + number + " is " + result2);
        System.out.println("The multiplicative persistence of " + number + " is " + result1);

    }
}