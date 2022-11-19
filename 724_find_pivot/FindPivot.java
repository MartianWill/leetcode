public class FindPivot {
    public int pivotIndex(int[] nums) {
        int presum = 0;
        for (int element : nums) {
            presum += element;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum == presum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        FindPivot fp = new FindPivot();
        int pivotIndex = fp.pivotIndex(nums);
        System.out.println(pivotIndex);
    }
}
