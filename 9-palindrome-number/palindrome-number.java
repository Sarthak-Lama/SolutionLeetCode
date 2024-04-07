class Solution {
    public boolean isPalindrome(int x) {
                     if (x < 0) {
            return false;
        }

        // Convert integer to string
        String strX = Integer.toString(x);

        // Use two pointers to check if the string is a palindrome
        int left = 0;
        int right = strX.length() - 1;
        while (left < right) {
            if (strX.charAt(left) != strX.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
