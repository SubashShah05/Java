
class Solution {
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

            if (sumSquare == 1) return true;
            else n = sumSquare;
        }

        return false;
    }
}