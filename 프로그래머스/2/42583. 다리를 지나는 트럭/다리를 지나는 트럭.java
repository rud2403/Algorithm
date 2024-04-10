import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int time = 0;
        Queue<Integer> queue = new LinkedList();
        
        for(int i = 0; i < truck_weights.length; i++) { // 대기 중인 트럭만큼 반복문 진행
            int truck = truck_weights[i];
            while(true) {
                if(queue.isEmpty()) { // 큐에 아무것도 없는 경우
                    queue.add(truck);
                    time++;
                    sum += truck;
                    break;
                } else if (queue.size() == bridge_length) { // 큐 자리가 가득 찬 경우
                    sum -= queue.poll();
                } else { // 큐에 자리가 있는 경우
                    if(weight < sum + truck) { // 무게가 넘는 경우
                        queue.add(0);
                        time++;
                    } else { // 무게에 여유가 있는 경우
                        queue.add(truck);
                        time++;
                        sum += truck;
                        break;
                    } 
                }   
            }           
        }
        
        return time + bridge_length;
    }
}