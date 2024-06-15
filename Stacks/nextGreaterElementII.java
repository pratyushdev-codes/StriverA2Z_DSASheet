import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementII {
    public static void main(String[] args) {
        
    }public class Solution {
    public int[] nextGreaterElements(int[] A) {
        int n = A.length;
        int[] res = new int[n]; 
        Arrays.fill(res, -1); // Initialize result array with -1    
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        // Iterate through the array twice to handle circular nature
        for (int i = 0; i < n * 2; i++) {       
            // Use modulo to wrap around the array
            while (!stack.isEmpty() && A[stack.peek()] < A[i % n]) {     
                
                res[stack.pop()] = A[i % n];
            }
            stack.push(i % n); // Push current index (mod n) onto the stack
        }
        return res; // Return the result array
    }
}
}
