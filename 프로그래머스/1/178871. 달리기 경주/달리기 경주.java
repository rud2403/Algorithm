import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        LinkedList<String> lkl = new LinkedList<>(Arrays.asList(players));
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        
        for(int i = 0; i < callings.length; i++) {
            
            int seq = map.get(callings[i]);
            String frontPlayer = players[seq - 1];
            
            map.replace(frontPlayer, seq);
            players[seq] = frontPlayer;
            
            map.replace(callings[i], seq - 1);
            players[seq - 1] = callings[i];
        }
        
        return players;
    }
}