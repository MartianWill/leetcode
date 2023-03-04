# 278 First Bad Version

n versions of update [1,2,...,n]. There is a bad version, and it messed up the following versions.
Given API `bool isBadVersion(version)` returns whether versionis bad. Find 1st bad version.

## Approach

Doing Binary Search as `704`. The first bad version could also fall in left of mid even if mid is bad version. Run binary search until mid-1 is good version, that means only bad version starting from mid.
O(log n) time complexity, half each step
O(1) space complexity, just pointers, no extra space.
