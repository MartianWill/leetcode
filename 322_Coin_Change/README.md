# Coin Change

Given integer array `coins` representing different denominations. Integer `amount` total money.
Return fewest number of coins need to make up that amound. Return `-1` if cannot make up by any combination.
Assume infinite number of each kind of coin.

## Approach

When one coin is chosen, the left amount is `amount- coin`,
given 3 coin types, there are three possible path , ` 11-1``11-2``11-5 `, and they will also end up with same calculation when recursion happens. ` 11-1=10``10-1=9 `while `11-2=9` thats a sample repeat.

O(n) time complexity,
O(n) space complexity.
