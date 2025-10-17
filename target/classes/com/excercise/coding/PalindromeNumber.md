## Palindrome Number

Given and integer ==x==, return ==true== if ==x== is a palindrome, and ==false== otherwise

### Constraints.
- Solve without converting the integer to string.
-  -2^31^ <= x <= 2^31^ -1 
-  TC: O(log n)
-  SC: O(1)
  
#### Example 1

input: x= 121
Output: true
Explanation: 121 reads as 121 from left to righ and from right to left

#### Example 2
input: x= -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

#### Example 3
input: x= 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.