import java.util.HashSet;

class Solution {
    public static boolean containDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 170, -368, 148, 672, 397, -629, -788, 192, 170, 309, -615, -237 };

        boolean result = containDuplicate(nums);
        System.out.println(result);
    }
}