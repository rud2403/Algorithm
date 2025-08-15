import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 가장 먼저 나가는 차량 시점에 cctv 설치 이후 진출 시 안찍히는 차량이 있으면 설치
        int answer = 1;
        
        // 진출 시점 기준으로 오름차순 정렬
        Arrays.sort(routes, new Comparator<int[]>() {
          @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]); // a[1] 기준 오름차순
            }
        });
        // 첫번째 차량의 진출 시점을 변수에 저장
        int cctv = routes[0][1];
        
        
        // routes 반복문 실행
        for(int[] route : routes) {
            // System.out.println(route[0] +", "+ route[1]);
            // 해당 차량의 진입 진출 시간이 진출시점 변수에 안걸리면 answer++, 진출 시점 변수 업데이트
            if(cctv < route[0] || cctv > route[1]) {
                answer++;
                cctv = route[1];
            }
        }
        
        return answer;
    }
}