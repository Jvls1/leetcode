package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[3];
        strs[0] = "flower";
        strs[1] = "flow";
        strs[2] = "flight";
        System.out.println(longestCommonPrefix(strs));
    }

    /*
        lógica por trás é que ordenando o array
        o primeiro e último elemento vão ter o mesmo prefixo
     */
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;
        while (idx < first.length() && idx < last.length()) {
            if (first.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return first.substring(0, idx);
    }
}
