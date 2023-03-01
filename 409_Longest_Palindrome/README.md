# Longest Palindrome

A palindrome is a word or sequence of characters that reads the same backward as froward.
Given string `s="abccccdd"`, one longgest palindrome that can be built is `"dccaccd"`. Return length of that, 7.

## Approach

Hashmap
go through count of each characters, use the largest odd count as mid characters,add all count. If there is an odd count, longest length +1 since all odd count were add in total count-1.

O(n) time complexity, go through each character
O(n) space complexity, depending on the occurences of each character and store them into hashmap.
