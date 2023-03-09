# Fibonacci Number

F(n) = F(n-1) +F(n-2), F(0)=0, F(1)=1.
F(2) = F(0)+F(1)

## Approach

Just a Fibonacci.
If just run recursively, the time complexity grows too fast as O(2^n), as each function call will call fib(n-1) and fib(n-2).
As most of fib(...) will be calc multiple times as n getting bigger. Therefore, memorizing the results calc previouly will be helpful. That is, store calculated value into an array or hashmap before return.
Dynamic programming is better. The complexity is then
O(n) time complexity, calculate each fib(...) and store it in memo array.
O(n) space complexity, n elements array.

We can further optimize this function since we only need to memorize two previous values. This will lower the space complexity to O(1).
