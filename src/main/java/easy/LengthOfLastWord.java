package easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println( lengthOfLastWord("  teste teste TAMANHO   "));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            if(count > 0 && s.charAt(i) == ' ') {
                break;
            }
        }
        return count;
    }
}
