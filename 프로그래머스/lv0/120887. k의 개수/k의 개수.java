class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        //j 까지 반복문을 돌리고, 문자열로 변환후 1과 비교하여 answer++
        for(int m = i; m <= j; m++){
            //String배열로 변환
            String[] arr = String.valueOf(m).split("");
            
            for(int n = 0; n < arr.length; n++){
                
                if(arr[n].equals(String.valueOf(k))) answer++;
                
            }
            
        }
        return answer;
    }
}