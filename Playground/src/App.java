import java.util.Scanner;

import classes.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils console = new Utils();

        // Prob 1. Get a 5 of numbers in array and print out next input value's index in
        // array
        Scanner sc = new Scanner(System.in); // Define scanner

        // int[] input = new int[5]; // Init array
        // for (int i = 0; i < input.length; i++) { // Input array values
        // System.out.print((i + 1) + "번 입력 : ");

        // input[i] = sc.nextInt();
        // }

        // System.out.print("몇번 째 값을 출력할까요? : "); // Enter index for find in array
        // int findIndex = sc.nextInt() - 1;

        // // Solution 1. Use try-catch
        // try {
        // System.out.println("찾는 값은 " + input[findIndex] + "입니다.");
        // } catch (Exception e) {
        // System.out.println("잘못된 입력입니다.");
        // return;
        // }

        // // Solution 2. Use if for validation
        // if (findIndex < 0 || findIndex >= input.length) {
        // System.out.println("잘못된 입력입니다.");
        // return;
        // }

        // System.out.println("찾는 값은 " + input[findIndex] + "입니다.");
        // ==========

        // Prob 2. Make a array over length 100, and find a number's count in array

        // int[] input2 = new int[125]; // Init array with random int value
        // for (int i = 0; i < input2.length; i++) {
        // input2[i] = (int) (Math.random() * 100);
        // }

        // // print input2 array
        // System.out.print("input2 array : ");
        // for (int i = 0; i < input2.length; i++) {
        // if (i == input2.length - 1) {
        // System.out.print(input2[i]);
        // break;
        // }
        // System.out.print(input2[i] + ", ");
        // }

        // System.out.println("");

        // System.out.print("Enter value for find : ");
        // int findValue = sc.nextInt(); // Enter value for find in array
        // int count = 0; // Init count

        // for (int i = 0; i < input2.length; i++) {
        // if (input2[i] == findValue) {
        // count++;
        // }
        // }

        // System.out.println("The number of " + findValue + " in array is " + count +
        // "개");

        // Prob3 . Make a array over length 100, and count even, and odd number in array
    }
}
