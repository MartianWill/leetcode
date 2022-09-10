# Intersection of Two Arrays

`int[] nums1 = { 1, 2, 2, 1 }`
`int[] nums2 = { 2, 2 }`

# Approach

Using `HashMap` to store nums1, `containKey` function to find intersection.
For each element in nums1, it will be stored as `Key`.
Since map will replace duplicates. Need a counter to store how many duplicates, as `Value`.
Then go through nums2 to see if it existed in HashMap.If existed, store it in a new array.
However, can't initialize this result array, since we don't have an array size in java. Using `LinkedList` requires no fixed size.
Lastly store `LinkedList` elements into result array.

`JavaScript` `Map` key can be any value.
