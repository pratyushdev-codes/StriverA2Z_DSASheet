public class Longestrepeatingcharacterreplacement {
    public static void main(String[] args) {
        
    } public int characterReplacement(String s, int k) {

        int max =0;
        int res=0;
        int arr []= new int[26];
        int l=0;
        for(int r=0;r<s.length();r++){

            arr[s.charAt(r)- 'A']++;
            max= Math.max(max, arr[s.charAt(r)-'A']);



            if(r-l+1-max>k){
                //invalid;
                arr[s.charAt(l)-'A']--;
                l++;

            }
            res= Math.max(res, r-l+1);


        }


        return res;







    }
}
