public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int si = 0, ti = 0; // index
        while (ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                if (si == s.length())
                    return true;
            }
            ti++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "", t = "ahbgdc";
        Boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
}