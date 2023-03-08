# Number of Islands

Given `m*n` 2D grid, represents map of `1`(land), and `0` (water), return number of islands.

Island is surrounded by water, edges of grid are considered as water filled.

## Approach

DFS in grid.
&emsp;&emsp;(r-1,c)
(r,c-1)(r,c)(r,c+1)
&emsp;&emsp;(r+1,c)
Move four directions, move back one step when null.
