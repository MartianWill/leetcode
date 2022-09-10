import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        LinkedList<Integer> resultList = new LinkedList<Integer>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) != 0) {
                resultList.add(i);
                map.replace(i, map.get(i) - 1);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersect(nums1, nums2);
        System.out.print(Arrays.toString(result));
    }
}

// // test
// HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
// map.put(1, 1);
// map.put(2, 2);
// int inserted = map.put(2, 2);
// map.replace(2, 3);
// map.replace(2, 3, 1);
// int a = map.get(2) + 10;
// boolean exist = map.replace(2, 3, a);
// // map.put(2, a + 10);
// System.out.print(map);
// System.out.print(exist);
// System.out.println(inserted);