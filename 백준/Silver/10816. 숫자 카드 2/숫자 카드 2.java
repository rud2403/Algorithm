import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] answerArr = new int[20_000_001];

        for(int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken()); // cards 묶음에 있는 카드
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        for(int i : map.keySet()) {
            answerArr[i + 10_000_000] = map.get(i);
        }

        int m = Integer.parseInt(br.readLine());
        int[] nums = new int[m];
        answer = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 찾기 시작
        for(int i = 0; i < nums.length; i++) {
            answer[i] = answerArr[nums[i] + 10_000_000];
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }

    }
}

