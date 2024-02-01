import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        ArrayList cache = new ArrayList<String>();
        
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer++;
            } else {
                if(cache.size() == cacheSize) {
                    cache.remove(0);
                }
                
                cache.add(city);
                answer+=5;
            }
        }
        
        return answer;
    }
}