import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();

        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] num = new int[m];
        // 뽑아내려고 하는 수 배열
        for(int i = 0; i < m; i++) {
            num[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 1; i <= n; i++) {
            dq.add(i);
        }

        for(int i : num) {
            int index = ((LinkedList<Integer>)dq).indexOf(i);
//            if(index == 0) dq.pollFirst(); // 제거하고자하는 수가 제일 앞에 있는 경우
//            if(index == dqSize - 1) dq.pollLast();  // 제거하고자하는 수가 제일 끝에 있는 경우

            // 찾으려고 하는 숫자의 인덱스 값이 size - 1 에서 반으로 나눈 값보다 크면 우측으로 이동, 그렇지 않으면 좌측으로 이동
            if(index > (dq.size()-1) / 2) { //
                while(((LinkedList<Integer>)dq).indexOf(i) != 0) {
                    // 맨 끝에 있는 요소 빼기
                    int end = dq.pollLast();
                    // 맨 앞으로 넣기
                    dq.offerFirst(end);
                    // answer 값 +1
                    answer++;
                }
                // 맨 끝에 있는 요소 삭제
                dq.removeFirst();

            } else {
                while(((LinkedList<Integer>)dq).indexOf(i) != 0) {
                    // 맨 앞에 있는 요소 빼기
                    int start = dq.pollFirst();
                    // 맨 끝으로 넣기
                    dq.offerLast(start);
                    // answer 값 + 1
                    answer++;
                }
                // 맨 앞에 있는 요소 삭제
                dq.removeFirst();
            }
        }

        System.out.println(answer);
    }
}