import java.util.*;

class Solution {
    
    private int toDays(String date) {
        String[] d = date.split("\\.");

        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);

        return year * 12 * 28 + month * 28 + day;
    }
    
    public int[] solution(String today, String[] terms, String[] privacies) { 
            
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(String term : terms){
            String[] a = term.split(" ");
            map.put(a[0], Integer.parseInt(a[1]) * 28);
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] b = privacies[i].split(" ");
            
            int date = toDays(b[0]);
            int expire = date + map.get(b[1]);
            
            if(toDays(today) >= expire){
                list.add(i + 1);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}