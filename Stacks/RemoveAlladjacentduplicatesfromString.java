import java.util.Stack;

/**
 * RemoveAlladjacentduplicatesfromString
 */
public class RemoveAlladjacentduplicatesfromString {

    public static void main(String[] args) {
        
    }public String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();


        for(int i =0;i<s.length();i++){
            if(st.size()==0){
                st.push(s.charAt(i));
            }else if(st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
            }


            char[] arr = new char[st.size()];
            for (int i = st.size() - 1; i >= 0; i--) {
                arr[i] = st.pop();
            }
    
            return new String(arr);
        }
    }
    