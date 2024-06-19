import java.util.Scanner;

import classes.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils console = new Utils();

        // Prob 1. Get a 5 of numbers in array and print out next input value's index in
        // array
        Scanner sc = new Scanner(System.in); // Define scanner

        int[] input = new int[5]; // Init array
        for (int i = 0; i < input.length; i++) { // Input array values
            System.out.print((i + 1) + "번 입력 : ");

            input[i] = sc.nextInt();
        }

        System.out.print("몇번 째 값을 출력할까요? : "); // Enter index for find in array
        int findIndex = sc.nextInt() - 1;

        // Solution 1. Use try-catch
        try {
            System.out.println("찾는 값은 " + input[findIndex] + "입니다.");
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // Solution 2. Use if for validation
        if (findIndex < 0 || findIndex >= input.length) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println("찾는 값은 " + input[findIndex] + "입니다.");

        // Prob 2. Make a array over length 100, and find a number's count in array

    }
}
