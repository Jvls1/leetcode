package easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(1010);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        char[] originalValues = String.valueOf(x).toCharArray();
        for (int i = 0; i < originalValues.length; i++) {
            if (originalValues[i] != originalValues[originalValues.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
