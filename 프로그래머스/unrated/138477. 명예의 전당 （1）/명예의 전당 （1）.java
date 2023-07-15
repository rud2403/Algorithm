import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++){
            if(pq.size() < k) { // 길이가 k를 넘지 않을 때
                pq.offer(score[i]);
            } else { // 길이가 k를 넘을 때
                if(pq.peek() < score[i]) { // 새로운 값이 기존 최소값보다 큰 경우
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}