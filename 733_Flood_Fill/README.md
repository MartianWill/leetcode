# 733 Flood Fill

Given `image` represented by `m * n` integer grid. Given integers `sr , sc , color`.
Do a flood fill on image staarting from pixel image[sr][sc].
To perform flood fill, consider the starting pixel + same color from 4-direction connected, + 4-direction connexted to those pixels, ... Replace those pixels' color with given `color`.

111 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;222
110 =>&nbsp; 220
101 &emsp;&ensp; 201

## Approach

Run a DFS and recursion. Four directions are represented by 2\*4 array. Search all adjacent elements, if same color as staring pixel then renew that color.

`NOTICE`, there might be a misunderstanding, at least I still don't get it. There is no need to change original array if the starting pixel has same color as new color. Even if the rest of array has different color.

O(n) time complexity, visit each elements in array.
O(n) space complexity, recursion takes extra space.
