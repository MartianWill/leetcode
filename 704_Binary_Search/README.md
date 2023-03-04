# Binary Search

Given ascending array || sorted, and a target in it, return the index of target, -1 if not exist.
Write with O(log n) time complexity.

## Approach

Two pointer `left, right`, the middle point will be `(left + right)/2` which will reach overflow when L or R is reaching integer limit.In this case `left+(right-left)/2` is better and gives the same result.
Compare elements at mid and target. If mid is larger than target in ascending array, then target is on left of mid, `right=mid-1`.

O(log n) time complexity, each step only takes half from previous.
O(1) space complexity, just pointers, no extra space is used.
