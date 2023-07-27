import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {

            HashMap<String, Integer> hm = new HashMap<>();
            long result = 1;

            int x = Integer.parseInt(br.readLine());

            // HashMap 세팅
            for(int j = 0; j < x; j++) {
                String[] strArr = br.readLine().split(" ");
                if(hm.containsKey(strArr[1])) { // 이미 키 값이 있으면
                    hm.replace(strArr[1], hm.get(strArr[1]) + 1);
                } else { // 키 값이 없으면
                    hm.put(strArr[1], 1);
                }
            }

            for (String s : hm.keySet()) {
                result *= hm.get(s) + 1;
            }
            System.out.println(result - 1);

        }
    }
}