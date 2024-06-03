import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
          
    }public static int [] twoSum(int [] sum , int target){
        Map<Integer, Integer> hm = new HashMap<>();
              for(int i = 0 ; i< sum.length; i++){
                if(hm.containsKey(target=sum[i])){
                 hm.put(sum[i], i);
                }
              }
        return new int []{};
    }
}