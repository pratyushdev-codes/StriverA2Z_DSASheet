/**
 * removeValidParenthesis
 */
public class removeValidParenthesis {

    public static void main(String[] args) {
        
    }  public String removeOuterParentheses(String s) {
        if (s.equals("")) {
            return s;
        }

        int open = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (open > 0) {
                    sb.append("(");
                }
                open++;
            } else if (s.charAt(i) == ')') {
                open--;
                if (open > 0) {
                    sb.append(")");
                }
            }
        }

        return sb.toString();
    }
}