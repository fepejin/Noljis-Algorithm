class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] let = letter.split(" ");
        
        for(String l : let){
            
            for(int i = 0; i < morse.length; i++){
                
                if(l.equals(morse[i])){
                    
                    answer += Character.toString(i + 97);
                    
                }
                
            }
        
        }
        
        
        return answer;
    }
}