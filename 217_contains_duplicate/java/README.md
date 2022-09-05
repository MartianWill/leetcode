# 217 Contain Duplicate

int[] nums = { 170, -368, 148, 672, 397, -629, -788, 192, 170, 309, -615, -237 };

## aproach

iterate through nums array, and add into `HashSet<Integer>` , find duplicate using `set.contains()`
