# Middle of the linked list

Find the middle node, if odd number of nodes, return the middle; or if even number of nodes, ruturn second middle node.

## Approach

Two pointer mid, temp
mid goes one by one, temp goes `next.next`.
`n` nodes, the middle node is at n/2 (second middle if even). 8/2=4 7/2=4.
mid++, temp+=2 (1,3,5,7)

O(n) time complexity, going through every nodes.
O(1) space complexity, not using extra space to store nodes, just pointers.
