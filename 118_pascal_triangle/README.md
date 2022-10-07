# 118 Pascal's Triangle

Given integer `numRows`, return Pascal's Triangle
<img src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" />

## Approach

Add 1 at first position everytime.
`j=1` Changing index j element dynamically with position `j + (j+1)`;
First row is `[1]`, j higher than `row.size()-1`, pass j loop.
Second row `[1,1]`, j equal `row.size()-1`, pass j loop.
Thrid row `[1,1,1]`, change `j=1` element, `[1,2,1]`.
4th row `[1,1,2,1]`, change `j=1` element, `[1,3,2,1]`, change `j=2` element, `[1,3,3,1]`
so on...
