## XOR in Java

Common Use Cases for XOR in Java:


- **Finding the Unique Element in an Array**: If an array contains numbers where every element appears an even number of times except for one unique element, XORing all elements together will isolate the unique element. This is because x ^ x = 0 and x ^ 0 = x, so all duplicate pairs cancel each other out, leaving only the unique number.
  :link: [SingleNumber.java](src/main/java/com/excercise/coding/SingleNumber.java)


    ```
    public class UniqueElementFinder {
            public static int findUnique(int[] nums) {
                int result = 0;
                for (int num : nums) {
                    result ^= num; // XOR all elements
                }
                return result; // The unique number remains
            }
        }
    ```

## Reverse and integer in Java

Reversing an integer in Java can be achieved using a mathematical approach with a loop. This method iteratively extracts the last digit of the original number and builds the reversed number.

  :link: [PalindromeNumber.java](src/main/java/com/excercise/coding/PalindromeNumber.java)

    public class ReverseInteger {
    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = 0;

        // Loop until the original number becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            originalNumber /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber); // Output: 54321
    }
    }

## Trailing Zeroes in a Factorial

To find the number of trailing zeros in a factorial, count the number of times 5 is a factor in the prime factorization of the number. This is calculated by summing the integer results of dividing the number (\(n\)) by powers of 5 (\(5,25,125,\) etc.) until the result is less than 1. Each pair of a 2 and a 5 creates a trailing zero, but there will always be more factors of 2 than 5, so only counting the factors of 5 is sufficient. 

 :link: [FactorialTrailingZeroes.java](src/main/java/com/excercise/coding/FactorialTrailingZeroes.java)

How to calculate the trailing zeros 

- Divide \(n\) by 5: Find the integer part of \(n/5\).
- Divide \(n\) by 25: Find the integer part of \(n/25\).
- Divide \(n\) by 125: Find the integer part of \(n/125\).
- Continue: Keep dividing \(n\) by increasing powers of 5 (\(625,3125,\) etc.) until the result is less than 1.
- Sum the results: Add up all the integer results from the divisions. This sum is the number of trailing zeros. 

Example: Find the trailing zeros in 137! 
- 137/5=27.4 (integer part is 27)
- 137/25=5.48 (integer part is 5)
- 137/125=1.096 (integer part is 1)
- 137/625<1 (stop here)
- 27 + 5 + 1 = **33** 


### Reverse Integer

To reverse an integer, you can use either a mathematical or string-based approach, both of which involve handling the sign and potential overflow issues. The mathematical method iteratively extracts the last digit using the modulo operator, builds the reversed number by multiplying by 10 and adding the digit, and then removes the last digit from the original number. The string method converts the integer to a string, reverses the string, handles the negative sign if present, and then converts it back to an integer. 

  :link: [ReverseInteger.java](src/main/java/com/excercise/coding/ReverseInteger.java)

Method 1: Mathematical approach

- Extract the last digit: Use the modulo operator (% 10) to get the last digit
- Build the reversed number: Multiply the current reversed number by 10 and add the extracted digit.
- Remove the last digit: Divide the original number by 10 using integer division (// 10) to remove the last digit.
- Repeat: Continue this process until the original number becomes zero.
- Handle negative numbers: The same logic works for negative numbers, though the modulo and division behavior may vary by language, so check the specific behavior for your programming language.
- Check for overflow: Before adding a new digit, check if the reversed integer will exceed the 32-bit signed integer range -2^31^ , 2^31^-1. If it does, return 0. 

