class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        char[] codeArr = code.toCharArray();
        
        for(int i = 0; i < codeArr.length; i++){
            if(mode == 0){
                if(codeArr[i] == '1') { 
                    
                    mode = 1; 
                    
                }else {
                    
                    if(i%2==0) ret += codeArr[i];
                }
            }else {
                if(codeArr[i] == '1'){
                    mode = 0;
                    
                }else{
                    
                    if(i%2==1) ret += codeArr[i];
                    
                }
                
            }
            
        }
        
        if(ret == "") return "EMPTY";
        
        return ret;
    }
}