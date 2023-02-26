# Reverse List

As title.

## Approach

recursively run current to the end
current.next -> current

O(n) time complexity, visit each node in the list
O(n) space complexity, recursion uses a stack for each recursive call, so n extra space to store each call.
