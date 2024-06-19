import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LongestSubstringwithoutrepeatingChar
 */
public class LongestSubstringwithoutrepeatingChar {

    public static void main(String[] args) {
        
    }  public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] hash = new int[256]; // Create an array to store the index of characters
        Arrays.fill(hash, -1); // Fill the array with -1
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (hash[s.charAt(right)] != -1) { // If the character has been seen before
                // Move the left pointer to the right of the last seen position
                left = Math.max(left, hash[s.charAt(right)] + 1);
            }

            // Update the last seen position of the character
            hash[s.charAt(right)] = right;

            // Calculate the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}