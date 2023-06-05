import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        int n = Integer.parseInt(strArr[0]); // 동전의 가치
        int k = Integer.parseInt(strArr[1]); // 만들어야하는 금액
        int result = 0;

        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            intArr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(intArr, Collections.reverseOrder());

        for (int i = 0; i < intArr.size(); i++) {
            while (intArr.get(i) <= k) {
                k -= intArr.get(i);
                result++;
            }

            if(k == 0) {
                break;
            }
        }

        System.out.println(result);
    }
}