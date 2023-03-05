# 235 Lowest Common Ancestor (LCA) of a Binary Search Tree

Given a BST, find the LCA node of two given nodes.
That is `p < ancestor < q`.
BST, all nodes in the left subtree of a node are less than the node's value, all nodes in the right ...

## Approach

For a root and p as left, q as right, `root.val - p.val >0` `root.val - q.val <0`, so `(root.val -p.val) * (root.val - q.val) <0`. Equal to 0 if root is one of p q.  
If not `>0`, then it's not common ancestor.
if `p.val < root.val` then `q.val <0` as well to have that `>0`. This also indicates p and q are both on left side of root. root should then go left to be bigger than q.

O(h) time complexity, max time required equal to tree height.
O(1) space complexity, no extra space required.
