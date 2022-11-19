# 1480 Running SUM of 1d Array

Given array `nums = [1,7,3,6,5,6]`. Find pivot index which is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

## Approach

Iterate all to get sum of array as `preSum`,O(N) complexity.
Initiate a `leftSum` which calc sum on the left side of piivot index.
If `left == right` then `2*left` should be equal to `preSum - pivot number`or `left + right + pivot == pre`.
