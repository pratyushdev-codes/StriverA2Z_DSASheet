public class LetterCombinationsofaPhoneNumber {
    
}import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> digitToLetters = getMap();
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        solve(0, digits, "", ans, digitToLetters);
        return ans;
    }

    private Map<Character, String> getMap() {
        Map<Character, String> digitToLetters = new HashMap<>();

        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        
        return digitToLetters;
    }

    private void solve(int i, String digits, String s, List<String> ans, Map<Character, String> digitToLetters) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }

        String letters = digitToLetters.get(digits.charAt(i));
        for (char c : letters.toCharArray()) {
            solve(i + 1, digits, s + c, ans, digitToLetters);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> result = sol.letterCombinations("23");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}

