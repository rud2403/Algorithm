import java.util.*;

class Solution {
    Set<Set<String>> result = new HashSet<>();
    
    public int solution(String[] user_id, String[] banned_id) {
        boolean[] checked = new boolean[user_id.length];
        dfs(user_id, banned_id, 0, checked, new HashSet<>());
        return result.size();
    }
    
    public void dfs(String[] user_id, String[] banned_id, int depth, boolean[] checked, Set<String> path) {
        if(depth == banned_id.length) {
            result.add(new HashSet<>(path));
            return;
        }
        
        for(int i = 0; i < user_id.length; i++) {
            if(checked[i]) continue;
            if(!isMatch(user_id[i], banned_id[depth])) continue;
            
            checked[i] = true;
            path.add(user_id[i]);
            
            dfs(user_id, banned_id, depth+1, checked, path);
            
            // 백트래킹
            checked[i] = false;
            path.remove(user_id[i]);
        }
    }
    
    public boolean isMatch(String user, String banned) {
        if(user.length() != banned.length()) return false;
        for(int i = 0; i < user.length(); i++) {
            if(banned.charAt(i) == '*') continue;
            if(user.charAt(i) != banned.charAt(i)) return false;
        }
        return true;
    }
}
