import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElementI {
    public static void main(String[] args) {
        
    }  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack <Integer> st= new Stack<>();
        HashMap<Integer, Integer>hm = new HashMap<>();


        for(int i =0;i<nums2.length;i++){
            if(st.size()<0 ){
                st.push(nums2[i]);

                while(st.size()>0 || st.peek()<nums2[i]){
                      hm.put(st.pop(), nums2[i]);
                

                }
                st.push(nums2[i]);
            }while(st.size()!=0){
                hm.put(st.pop(),-1);
            }
        }for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
        }
}
        
    

