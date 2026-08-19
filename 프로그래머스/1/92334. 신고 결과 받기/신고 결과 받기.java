import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report)); //같은 신고 제거
        Map<String, Integer> count = new HashMap<>(); 
        Map<String, Integer> result = new HashMap<>(); 
        
        for ( String id : id_list ){
            count.put(id, 0);
            result.put(id, 0);
        }
        
        for ( String v : reportSet){
            String[] value = v.split(" ");
            String reported = value[1];
            
            count.put(reported, count.get(reported) + 1);
        }
        
        for ( String v : reportSet ){
            String[] value = v.split(" ");
            
            String reporter = value[0];
            String reported = value[1];
            
            if(count.get(reported) >= k){
                result.put(reporter, result.get(reporter) + 1);
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for ( int i = 0; i < id_list.length; i++ ){
            answer[i] = result.get(id_list[i]);
        }
        
        return answer;
    }
}