import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        
        Arrays.sort(array); //오름차순 정렬 
        
        int len = array.length;
        int answer = array[0]; //0번째 수
        int sub = Math.abs(n - array[0]); //0번째 수와의 차이
        
        for(int i = 1; i < len; i++){ //1번째부터 마지막번째까반복문
            
            int subAbs = Math.abs(n - array[i]); //차이의 절대값
            
            if(subAbs < sub){ //subAbs 가 sub보다 작으면 저장. 같으면 더 작은 수 저장하도록함
                
                sub = subAbs;  
                answer = array[i];
                
            }
            
        }
        
        return answer;
        
    }
}