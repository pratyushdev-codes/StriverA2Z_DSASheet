import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        
    }public static int [] twoSum(int arr [], int target){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            if(hm.containsKey(target=arr[i])){
              
                return new int[] {hm.get(target -arr[i]), i};
            }
            hm.put(arr[i], i);
        }
        return new int[]{};
    }
}