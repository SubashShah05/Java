class Solution {

    // Palindrome function
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            // skip special characters from left
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            // skip special characters from right
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            // compare ignoring case
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // Main function
    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "A man, a plan, a canal: Panama";

        System.out.println(obj.isPalindrome(s));
    }
}