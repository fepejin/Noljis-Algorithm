import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] aa = a.toCharArray(); 
        String answer = "";
        
        for(int i = 0; i < aa.length; i++){
            
            if(Character.isUpperCase(aa[i]) ){
                
                answer += Character.toLowerCase(aa[i]);
                
            }else{
                answer += Character.toUpperCase(aa[i]);
            }
            
        }
        
        System.out.println(answer);
    }
}