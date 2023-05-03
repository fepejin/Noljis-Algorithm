class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if((number % n) == (number % m) && (number % n) == 0){
            
            answer = 1;
            
        }
        
        return answer;
    }
}