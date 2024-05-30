import java.util.HashMap;

public class subarraySumequalsK {
    public static void main(String[] args) {
        
    }public static int maxSumEqualsK(int arr [], int k){
        HashMap<Integer, Integer> hm= new HashMap<>();
        int sum =0 ;

    int count =0;
    hm.put(0,1);
        for(int i =0;i<arr.length;i++){
            sum += arr[i];

        }
        if(hm.containsKey(sum-k)){
            count = count + hm.get(sum-k);

        }
        hm.put(sum , hm.getOrDefault(sum, 0)+1);
        return count;
    }

}

