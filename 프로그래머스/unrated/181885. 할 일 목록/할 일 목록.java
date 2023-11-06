import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        int length = todo_list.length;
        
        for(int i = 0; i < length; i++){
            
            if(!finished[i]){
                
                answer.add(todo_list[i]);
                
            }
            
        }
        
        return answer.toArray(answer.toArray(new String[0]));
    }
}