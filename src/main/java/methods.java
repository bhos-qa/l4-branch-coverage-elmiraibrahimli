import java.util.*;

public class methods {

    // 1st Method: Sum of all elements in an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2nd Method: Find the maximum element in an array
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 3rd Method: Fibonacci sequence up to n
    public List<Integer> fibonacciSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            sequence.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        return sequence;
    }

    // 4th Method: Factorial of a number
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 5th Method: Reverse a string
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // 6th Method: Count occurrences of a character in a string
    public int countOccurrences(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    // 7th Method: Check if a string is a palindrome
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 8th Method: Merge two sorted lists
    public List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }
        return merged;
    }

    // 9th Method: Rotate an array to the right by k steps
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // 10th Method: Intentionally vulnerable method
    public String vulnerableMethod(String password) {
        // Vulnerability: Hard-coded password check
        if (password.equals("1234")) {
            return "Access granted";
        } else {
            return "Access denied";
        }
    }
}
