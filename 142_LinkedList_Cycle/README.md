# Linked List Cycle II

Continuously following the `next`, a previous node will be reached again. tail's next is connected to `pos` index. pos is not passed in.

## Approach

`fast, slow` pointer. slow moves one/step, fast moves 2/step. Set fast back to head and moves 1/step.
o-o
/ \
o-o-o o(meet)
\ /
o
`x` distance from start to cycle pos, `2` in this case
`y` distance form pos to xy meet, `3` in this case
slow moves `x+y=5`, fast moves `2(x+y)=10`. True cuz fast moves twice faster.
Fast moves fast, so it will lap slow at least one cycle `c`.
Therefore, `2(x+y)-(x+y)=(x+y)=N*c`. `c` `-`whats left of the cycle after meeting `y`, comes to `c-y=x`, gives slow need `x` step to finish this cycle.
Fast back to head moves 1/step will move `x` as well to reach `pos`, which means fast and slow will eventually meet up.

O(n) time complexity, fast need less than n iteration. slow need full n iteration.
O(1) space complexity, just two pointers, no extra space
