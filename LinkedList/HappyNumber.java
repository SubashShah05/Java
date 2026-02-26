import java.util.HashSet;

class Solution {

    // Function to check Happy Number
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n)) {

            set.add(n);
            int sumSquare = 0;

            while (n > 0) {
                int digit = n % 10;
                sumSquare += digit * digit;
                n /= 10;
            }

            if (sumSquare == 1)
                return true;
            else
                n = sumSquare;
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        Solution obj = new Solution();

        int num = 19;   // test number

        if (obj.isHappy(num))
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + " is NOT a Happy Number");
    }
}