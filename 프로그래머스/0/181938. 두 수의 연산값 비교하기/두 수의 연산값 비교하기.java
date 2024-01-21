class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int abPlus = Integer.parseInt("" + a + b);
        
        answer = (abPlus >= 2*a*b) ? abPlus : 2*a*b;
        
        return answer;
    }
}