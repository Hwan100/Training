import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for(int i = 0; i < survey.length; i++){
            switch (choices[i]){
                case 1 -> map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 3);
                case 2 -> map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 2);
                case 3 -> map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 1);
                case 4 -> {}
                case 5 -> map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 1);
                case 6 -> map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 2);
                case 7 -> map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 3);
            }
        }

        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');
            
        return sb.toString();
    }
}