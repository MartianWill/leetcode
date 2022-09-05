# 53 max_subArray

nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4 ]
init `sum=0` `max=Integer.MIN_VALUE`

## aproach

When `sum<0` the number next will always become smaller after its sum iteration. Therefore, sum should be set to the new number or 0 (reset and reset subArray at the same time) in this case.

## if return subArray??

Thought:
When max change, store the array
When max not change, store temp array for potentional increase use

| sum | max | array                           |
| --- | --- | ------------------------------- |
| 1   | 1   | [1]                             |
| -2  | 1   | [1]                             |
| 4   | 4   | [4]                             |
| 3   | 4   | [4],temp=[4,-1]                 |
| 5   | 5   | [4,-1,2]                        |
| 6   | 6   | [4,-1,2,1]                      |
| 1   | 6   | [4,-1,2,1] , temp=[4,-1,2,1,-5] |
| 5   | 6   | [4,-1,2,1]                      |
