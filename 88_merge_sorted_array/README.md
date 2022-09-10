# 88 Merge Sorted Array

`int[] nums1 = { 0, 0, 3, 0, 0, 0, 0, 0, 0 }` `int m = 3`
`int[] nums2 = { -1, 1, 1, 1, 2, 3 }` `int n = 6`

## Approach

sorting from the last index of each array.
Special case only occurs when nums1[index] is greater than nums2[index]. If last element of nums2, which is also the largest element in nums2, is greater than that in nums1, then simply put it at the end of nums1, since they all sorted arrays.
In this case, the best scenario is `nums1=[1,2,3]` and `nums2=[4,5,6]`, nums2 elements will always be larger than nums1 elements.
Or when equal, `nums1=[1,2,3]` `nums2=[3,3]` still put nums2 elements at the end of nums1.

When while loop end with m>0, n=0, that means operation on nums2 is done, no further action required from nums1.
loop end with m=0, n>0, that means elements in nums2 cann't beat those in nums1. Need to clean old nums1 elements and push nums2 leftover elemenets.

| nums1                         | nums2                 | m   | n   |
| ----------------------------- | --------------------- | --- | --- |
| [0, 0, `3`, 0, 0, 0, 0, 0, 0] | [-1, 1, 1, 1, 2, `3`] | 3   | 6   |
| [0, 0, `3`, 0, 0, 0, 0, 0, 3] | [-1, 1, 1, 1, `2`, 3] | 3   | 5   |
| [0, `0`, 3, 0, 0, 0, 0, 3, 3] | [-1, 1, 1, 1, `2`, 3] | 2   | 5   |
| [0, `0`, 3, 0, 0, 0, 2, 3, 3] | [-1, 1, 1, `1`, 2, 3] | 2   | 4   |
| [0, `0`, 3, 0, 0, 1, 2, 3, 3] | [-1, 1, `1`, 1, 2, 3] | 2   | 3   |
| [0, `0`, 3, 0, 1, 1, 2, 3, 3] | [-1, `1`, 1, 1, 2, 3] | 2   | 2   |
| [0, `0`, 3, 1, 1, 1, 2, 3, 3] | [`-1`, 1, 1, 1, 2, 3] | 2   | 1   |
| [`0`, 0, 0, 1, 1, 1, 2, 3, 3] | [`-1`, 1, 1, 1, 2, 3] | 1   | 1   |
| [0, 0, 0, 1, 1, 1, 2, 3, 3]   | [`-1`, 1, 1, 1, 2, 3] | 0   | 1   |
| [-1, 0, 0, 1, 1, 1, 2, 3, 3]  | [-1, 1, 1, 1, 2, 3]   | 0   | 0   |
