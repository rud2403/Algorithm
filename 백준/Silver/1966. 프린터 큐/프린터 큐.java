import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int tc;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            StringTokenizer str = new StringTokenizer(br.readLine());

            LinkedList<int[]> q = new LinkedList<>();

            for (int j = 0; str.hasMoreTokens(); j++) {
                q.add(new int[]{j, Integer.parseInt(str.nextToken())});
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] temp = q.poll();
                boolean check = true;

                //자기보다 큰 값이 있다면 뒤로 넘겨라
                for (int j = 0; j < q.size(); j++) {
                    if (temp[1] < q.get(j)[1]) {
                        q.add(temp);

                        for (int k = 0; k < j; k++)
                            q.add(q.poll());

                        check = false;
                        break;
                    }
                }

                //만약에 front가 가장 큰 값이 아니라면 다시 반복해라
                if (check == false)
                    continue;

                //만약 최고값이라면 poll했으니 count를 세줘라
                count++;

                //만약 그값이 우리가 원하는 답이라면 이만 멈추고 저장하자.
                if (temp[0] == M)
                    break;

            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}