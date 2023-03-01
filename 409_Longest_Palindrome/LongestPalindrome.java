import java.util.HashMap;
import java.util.Map;

import javax.swing.border.MatteBorder;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        // int string length and longest palindrome length
        int sLen = s.length();
        int longestLen = 0;
        // create a new hash map to store each character in string s,
        // with number count as key
        HashMap<Character, Integer> sChar = new HashMap<>();

        // iterate each character in string s
        for (int i = 0; i < sLen; i++) {
            char c = s.charAt(i);
            int count = sChar.getOrDefault(c, 0);
            sChar.put(c, count + 1);
        }

        // go through count of each characters, use the largest
        // odd count as mid characters,
        // add even count to longestLen,add rest count-1 to longestLen
        boolean hasOdd = false;
        for (int count : sChar.values()) {
            if (count % 2 == 1) {
                longestLen += count - 1;
                hasOdd = true;
            } else {
                longestLen += count;
            }
        }
        if (hasOdd) {
            return longestLen + 1;
        }
        return longestLen;
    }

    public static void main(String[] args) {
        String str = "bb";

        int result = longestPalindrome(str);
        System.out.println(result);
    }
}
