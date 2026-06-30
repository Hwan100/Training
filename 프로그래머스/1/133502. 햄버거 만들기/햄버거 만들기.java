import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        
        int burger[] = {1, 2, 3, 1};
        
        List<Integer> list = new ArrayList();
        int answer = 0;
        
        for(int i : ingredient){
            list.add(i);
            
            if(list.size() >= 4){
                int size = list.size();
                
                if(list.get(size-4) == 1 &&
                   list.get(size-3) == 2 &&
                   list.get(size-2) == 3 &&
                   list.get(size-1) == 1) {
                    list.remove(size-1);
                    list.remove(size-2);
                    list.remove(size-3);
                    list.remove(size-4);
                    answer++;
                }
            }
        }
        
        return answer;
    }
}