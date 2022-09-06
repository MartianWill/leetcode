# 1 Two Sum

nums=[2,7,11,15], target=9, find indices of two numbers such that they add up to target.

## Thought

`HashMap` came in mind, but duplicate numbers will replace map `key` with new value.
Using index as key will avoid duplicate keys. But won't able to return key from value.
Using `HashSet` need to get index from array, iteration will take O(n), `binarySearch` take O(log n) but require `sorted` array.

## Approach

Turns out this problem has one assumption: 'each input would have exactly one solution', so there will be at most 2 elements with the same value.
For, `[3,3]` case, the second entry will replace map key with the second one, which means, one index comes from for loop while another index comes from map.
