/**
    1. x에 n을 더한다.
    2. x에 2를 곱한다.
    3. x에 3을 곱한다.
**/
import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        return bfs(x, y, n);
    }
    
    public int bfs(int x, int y, int n) {
        Queue<int[]> q = new LinkedList<>(); // [현재 숫자, 방문횟수]
        Set<Integer> visited = new HashSet<>(); // 현재까지 나온 숫자들 저장
        int answer = -1;
        q.add(new int[]{x, 0});
        visited.add(x);
        
        while(!q.isEmpty()) {
            int[] intArr = q.poll();
            if (intArr[0] < y) {
                int mulThree = intArr[0] * 3;
                int mulTwo = intArr[0] * 2;
                int plusN = intArr[0] + n;
                if(!visited.contains(mulThree)) {
                    q.add(new int[]{mulThree, intArr[1] + 1});
                    visited.add(mulThree);
                }
                if(!visited.contains(mulTwo)) {
                    q.add(new int[]{mulTwo, intArr[1] + 1});
                    visited.add(mulTwo);
                }
                if(!visited.contains(plusN)) {
                    q.add(new int[]{plusN, intArr[1] + 1});
                    visited.add(plusN);
                }
            }
            
            if(intArr[0] == y) {
                answer = intArr[1];
                break;
            }
        }
        return answer;
    }
}