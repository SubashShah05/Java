package Array;

public class PassingArgument {

    // method receiving array
    public static void printArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+1+" ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // passing array as argument
        printArray(numbers);
    }
}