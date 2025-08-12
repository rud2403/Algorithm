import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 바구니 개수 및 마지막 번호
        int m = Integer.parseInt(st.nextToken()); // 역순으로 만들 순서
        int[] basket = new int[n];
        int temp = 0;

        for(int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int last = (end - start) / 2;

            for(int j = 0; j <= last; j++) {
                temp = basket[start + j];
                basket[start + j] = basket[end - j];
                basket[end - j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : basket) sb.append(i).append(" ");
        System.out.println(sb);
    }
}
