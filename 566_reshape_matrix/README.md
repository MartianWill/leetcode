# 566 Reshape Matrix

Changing `m*n` array to `r*c` array.
`int[][] mat = { { 1, 2 }, { 3, 4 } }`

## Approach

Loop through the r*c original array using `i/c`and`i%c`.
`i/c` gives integer from `0` to `r-1` as i goes from `0 to r*c`, that's how many rows required.

Loop the `m*n` array and assign it to new `r*c` array while looping `r*c` array. `i/n` `i%n` same method.
