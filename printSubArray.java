package Array;

public class printSubArray {

    // Method to print all subarrays
    public static void printSubarray(int[] numbers){

        // Outer loop → selects starting index
        for(int i = 0; i < numbers.length; i++){

            int start = i;   // starting point of subarray

            // Middle loop → selects ending index
            for(int j = i; j < numbers.length; j++){

                int end = j; // ending point of subarray

                // Inner loop → prints elements from start to end
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " "); //subarray
                }

                // move to next line after one subarray is printed
                System.out.println();
            }

            // extra line after each starting index (for readability)
            System.out.println();
        }
    }

    public static void main(String[] args){

        // Array declaration
        int[] numbers = {2, 4, 6, 8, 10};

        // Method call to print all subarrays
        printSubarray(numbers);
    }
}