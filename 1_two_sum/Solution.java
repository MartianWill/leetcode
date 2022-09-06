import java.util.HashMap;

public class Solution{
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        // HashSet<Integer> set = new HashSet<Integer>();
        int index1 =0;
        int index2 =0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            // set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target-nums[i];
            // if(set.contains(anotherNum)) {}
            if(map.containsKey(anotherNum)){
                if(i!=map.get(anotherNum)){
                    index1=i;
                    index2=map.get(anotherNum);
                    System.out.println(index2);
                }
            }
        } 
        return new int[] {index1,index2};
    }

    //return array without assigning 
    // public static int[] sth() {
    //     return new int[] {1,2};
    // }
    // int[] newArray = sth();
    // System.out.println(newArray);

    // sorted array only
    // public static int search(int[] nums) {
    //     int result = Arrays.binarySearch(nums, 11);
    //     return result;
    // }
    // System.out.println(search(nums));

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =9;
        // int[] nums= {3,3};
        // int target =6;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]+"," +result[1]);
    }
}