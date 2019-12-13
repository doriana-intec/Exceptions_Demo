package jp.ekata;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        boolean repeat = true;
        int result = 0;
        do {
            try {
                System.out.println("Enter the first nr:");
                int number = Integer.parseInt(kbd.nextLine());
                System.out.println("Enter the denominator:");
                int denominator = Integer.parseInt(kbd.nextLine());
                result = number / denominator;

                repeat = false;

            } catch (NumberFormatException | ArithmeticException e) {
                e.printStackTrace();
            }
        } while (repeat);

        System.out.println(result);
        kbd.close();

    }
}
