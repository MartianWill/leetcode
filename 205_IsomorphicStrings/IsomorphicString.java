import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        if ((s == null && t != null) || (s != null && t == null))
            return false;
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map1.containsKey(a)) {
                if (!map2.containsKey(b) || map2.get(b) != a)
                    return false;
            } else {
                if (map2.containsKey(b))
                    return false;
                map1.put(a, b);
                map2.put(b, a);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        Boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
