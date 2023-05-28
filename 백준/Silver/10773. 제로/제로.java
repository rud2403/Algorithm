import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        int k = Integer.parseInt(br.readLine());
        long result = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0 ){ // 0인 경우
                list.remove(list.size() - 1); // 마지막 요소 제거
            } else { // 0이 아닌 경우
                list.add(num);
            }
        }

        for (Integer i : list) {
            result += i;
        }

        System.out.println(result);
    }
}