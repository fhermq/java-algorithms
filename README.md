## XOR in Java

Common Use Cases for XOR in Java:


- **Finding the Unique Element in an Array**: If an array contains numbers where every element appears an even number of times except for one unique element, XORing all elements together will isolate the unique element. This is because x ^ x = 0 and x ^ 0 = x, so all duplicate pairs cancel each other out, leaving only the unique number.
  :link:[SingleNumber.java](src/main/java/com/excercise/coding/SingleNumber.java)


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

