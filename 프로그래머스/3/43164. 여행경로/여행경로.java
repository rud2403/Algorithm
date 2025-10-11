import java.util.*;

class Solution {
    static Map<String, PriorityQueue<String>> map;
    static List<String> airPorts = new ArrayList<>();
    static int count = 1;
    public String[] solution(String[][] tickets) {
        
        // -- 기본 세팅 시작
        // 맵: 우선순위 큐 자료구조 생성
        map = new HashMap<>();
        
        // 맵에 출발지 세팅
        for(int i = 0; i < tickets.length; i++) {
            map.put(tickets[i][0], new PriorityQueue<String>());
            map.put(tickets[i][1], new PriorityQueue<String>());
        }
        
        // 생성된 출발지에 목적지 세팅
        for(int i = 0; i < tickets.length; i++) {
            PriorityQueue pq = map.get(tickets[i][0]);
            pq.offer(tickets[i][1]);
            count++;
        }
        // -- 기본 세팅 끝
        
        // 기본세팅 출력 테스트용
        // for(String s: map.keySet()) {
        //     System.out.print("key: " + s + ", value: " + map.get(s));
        //     System.out.println();
        // }
        
        dfs("ICN");
        
        Collections.reverse(airPorts);
        
        return airPorts.toArray(new String[0]);
    }
    
    public void dfs(String departure) {
        PriorityQueue<String> pq = map.get(departure);
        while (pq != null && !pq.isEmpty()) {
            String next = pq.poll();
            dfs(next);
        }
        
        airPorts.add(departure);
    }
}