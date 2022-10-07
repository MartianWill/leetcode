# 1480 Running SUM of 1d Array

Given array `[1,2,3,4]`, return `[1, 1+2, 1+2+3, 1+2+3+4]`.

## Approach

`result[0]` never require operation.
Rest element is previous + current.
