import java.util.Arrays;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // // this worked
        // int len = 0;
        // while (n > 0 && m > 0) {
        // len = m + n;
        // int i = m - 1; // nums1 index
        // int j = n - 1; // nums2 index
        // if (nums1[i] < nums2[j]) {
        // nums1[len - 1] = nums2[j];
        // n--;
        // } else {
        // nums1[len - 1] = nums1[i];
        // m--;
        // }
        // }
        // while (n > 0) {
        // nums1[m + n - 1] = nums2[n - 1];
        // n--;
        // }

        // simplified version
        int len = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[len--] = nums1[m--];
            } else {
                nums1[len--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[len--] = nums2[n--];
        }
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;
        int[] nums1 = { 0, 0, 3, 0, 0, 0, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { -1, 1, 1, 1, 2, 3 };
        int n = 6;
        merge(nums1, m, nums2, n);
        System.out.print(Arrays.toString(nums1));
    }
}
