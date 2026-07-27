class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        
        int x = 0;
        int y = 0;
        
        // 시작 위치
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                }
            }
        }
        
        for(String route : routes){
            String[] cmd = route.split(" ");
            
            char dir = cmd[0].charAt(0);
            int dist = Integer.parseInt(cmd[1]);
            
            // 이동 방향
            int dx = 0;
            int dy = 0;
            
            switch(dir){
                case 'N' -> dx = -1;
                case 'S' -> dx = 1;
                case 'W' -> dy = -1;
                case 'E' -> dy = 1;
                    
            }
            
            // 이동 후 위치
            int nx = x;
            int ny = y;
            boolean possible = true;
            
            for(int i = 0; i < dist; i++){
                nx += dx;
                ny += dy;
                
                if(nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X'){
                    possible = false;
                    break;
                }
            }
            
            if(possible){
                x = nx;
                y = ny;
            }
        }
        
        return new int[]{x, y};
    }
}