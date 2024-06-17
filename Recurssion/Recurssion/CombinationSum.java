import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        
    } public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();


    }public void combination(int candidates [] , int target, int index , List<List<Integer>> ans, List<Integer> ds){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));

            }
            return ;
        }
        //pick
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            combination(candidates, target-candidates[index], index, ans, ds);
            ds.remove(ds.size()-1);
        }
        //unpick
        combination(candidates, target, index+1, ans, ds);
    }
}
