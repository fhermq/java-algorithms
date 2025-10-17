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


