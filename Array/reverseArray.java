package Array;

public class reverseArray {

    public static void printReverse(int[] numbers) { //printReverse → method name  //numbers → parameter (inside method)

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            // swap
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        printReverse(numbers); //Calling a method (function) named printReverse  //and passing numbers as an argument.

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}