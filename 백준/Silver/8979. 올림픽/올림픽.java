import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String str = br.readLine();
        String[] strArr = str.split(" ");

        int count = Integer.parseInt(strArr[0]);
        int search = Integer.parseInt(strArr[1]);

        for(int i = 0; i < count; i++) {
            String s = br.readLine(); // 국가번호 / 금 / 은 / 동
            String[] sArr = s.split(" ");
            int score = (Integer.parseInt(sArr[1]) * 3) + (Integer.parseInt(sArr[2]) * 2) + (Integer.parseInt(sArr[3]) * 1);

            arrayList.add(score);
            map.put(sArr[0], score);
        }
        Collections.sort(arrayList);

        Integer searchScore = map.get(String.valueOf(search));

        int result = arrayList.indexOf(searchScore) + 1;

        System.out.println(result);
    }
}
