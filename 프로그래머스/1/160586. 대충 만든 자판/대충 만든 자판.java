import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                
                if (!map.containsKey(c) || map.get(c) > i + 1){
                    map.put(c, i + 1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            sum = 0;
            
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                
                if(!map.containsKey(c)){
                    sum = -1;
                    break;
                }
                
                sum += map.get(c);
            }
            
            answer[i] = sum;
        }
        
        
        return answer;
        
    }
}