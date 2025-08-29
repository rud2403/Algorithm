import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 배열 세팅
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(a);

        // b배열을 기준으로 a 배열에서 존재하는 지 찾기
        for(int num : b) {
            int lo = 0, hi = n - 1;
            boolean found = false;
            while(lo <= hi) {
                int mid = (lo + hi) / 2;
                if(a[mid] == num) {
                    found = true;
                    break;
                }
                if(a[mid] < num) lo = mid + 1;
                else {
                    hi = mid - 1;
                }
            }
            sb.append(found? 1 : 0).append('\n');
        }

        System.out.println(sb.toString());
    }
}