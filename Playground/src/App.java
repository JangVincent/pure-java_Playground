import java.util.Scanner;

import classes.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
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
        // ==========

        // Prob 2. Make a array over length 100, and find a number's count in array
        int[] input2 = new int[125]; // Init array with random int value
        for (int i = 0; i < input2.length; i++) {
            input2[i] = (int) (Math.random() * 100);
        }

        // print input2 array
        System.out.print("input2 array : ");
        utils.logArray(input2);

        System.out.print("Enter value for find : ");
        int findValue = sc.nextInt(); // Enter value for find in array
        int count = 0; // Init count

        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == findValue) {
                count++;
            }
        }

        System.out.println("The number of " + findValue + " in array is " + count +
                "개");
        // ==========

        // Prob3 . Make a array over length 100, and count even, and odd number in array
        int[] input3 = new int[125]; // Init array with random int value
        for (int i = 0; i < input3.length; i++) {
            input3[i] = (int) (Math.random() * 100);
        }

        int evenNumberCount = 0;
        int oddNumberCount = 0;

        for (int i = 0; i < input3.length; i++) {
            if (input3[i] % 2 == 0) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }

        System.out.println("The number of even number in array is " + evenNumberCount
                + "개");
        System.out.println("The number of odd number in array is " + oddNumberCount +
                "개");

        // ==========

        // Prob4. Fibonacci sequence
        // arr[n] = arr[n-1] + arr[n-2]

        int[] fibo = new int[10]; // Init array with length 10
        fibo[0] = 0; // Init first value
        fibo[1] = 1; // Init second value

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        utils.logArray(fibo);
    }
}
