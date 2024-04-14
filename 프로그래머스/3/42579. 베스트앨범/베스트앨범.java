import java.util.*;

class Solution {
    public ArrayList solution(String[] genres, int[] plays) {
        // genres = 노래의 장르
        // plays = 노래별 재생 횟수
        // 1 <= genres / plays <= 1,000
        // {0 : {{genre : 'classic'}, {plays : 500}}}

        // 수록 기준
        // 1. 제일 많이 재생된 장르 먼서 수록
        // 2. 장르 내에서 많이 재생된 노래 먼저 수록
        // 3. 재생횟수가 같다면 고유번호가 낮은 노래 먼저 수록
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        Map<String, Integer> num = new HashMap<>(); // 장르별 총 개수
        Map<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르에 속하는 노래 및 재생횟수
        for(int i = 0; i < plays.length; i++) {
            if(!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }
        
        List<String> keySet = new ArrayList(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
        
        for(String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
            
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
            
            answer.add(genre_key.get(0));
            
            if(genre_key.size() > 1) {
                answer.add(genre_key.get(1));    
            }
            
        }
        
        return answer;
        
    }
}