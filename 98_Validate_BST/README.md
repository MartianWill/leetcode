# Validate Binary Search Tree

As title. Using DFS, depth first search. Store all left branches first. That will have height number of nodes if nothing goes wrong on left branch.
O(n) time complexity, visit each node in the tree.
O(h) space complexity, extra space required for stack, and only the height `h` of the binary tree, because the max number of nodess stored in stack is euqal to height.
