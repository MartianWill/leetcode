# 102 Binary Tree Level Order Traversal

As title, return level order of a binary tree, nodes with left and right. level by level, return list in list.

## Approach

use a Queue to store the root. Find the child nodes for each root. When root node is removed, queue will store the next level nodes.

O(n) and O(n), go through each node and store them with extra space in queue.
