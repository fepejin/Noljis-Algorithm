import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] beArr = before.split("");
        String[] afArr = after.split("");
        
        Arrays.sort(beArr);
        Arrays.sort(afArr);
        
        if(Arrays.equals(beArr, afArr)){
            
            answer = 1;
            
        }
        
        return answer;
    }
}