import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        
        Map<Character, int[]> move = Map.of(
            'U', new int[]{0, 1},
            'D', new int[]{0, -1},
            'L', new int[]{-1, 0},
            'R', new int[]{1, 0}
        );
        
        for (char dir : dirs.toCharArray()) {
            int nx = x + move.get(dir)[0];
            int ny = y + move.get(dir)[1];
            
            if (nx > 5 || nx < -5 || ny > 5 || ny < -5) continue;
            
            String path = x + "," + y + "-" + nx + "," + ny;
            String reversePath = nx + "," + ny + "-" + x + "," + y;
            visited.add(path);
            visited.add(reversePath);
            
            x = nx;
            y = ny;
        }
        
        return visited.size() / 2;
    }
}