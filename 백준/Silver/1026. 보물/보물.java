import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        HashMap<Integer, Integer> index = new HashMap<>();

        int temp = 0;
        int result = 0;
        // a, b 리스트에 각각의 요소 주입
        for(int i = 0; i < 2; i++) {
            String s = br.readLine();
            String[] sArr = s.split(" ");

            for (int j = 0; j < sArr.length; j++) {
                if(i == 0) {
                    a.add(Integer.valueOf(sArr[j]));
                } else {
                    b.add(Integer.valueOf(sArr[j]));
                    index.put(Integer.valueOf(sArr[j]), j);
                }
            }
        }

        // a 리스트 오름차순 정렬
        Collections.sort(a);

        // b 리스트 내림차순 정렬
        Collections.sort(b, Collections.reverseOrder());

        // b의 값에 따라 a 요소 재 정렬 ( b의 최댓값 인덱스에 a 최소값 넣기 )
        for(int i = 0; i < n; i++) {
            int idx = index.get(b.get(i));

            temp = a.get(idx);
            a.set(idx, a.get(i));
            a.set(i, temp);

            temp = b.get(idx);
            b.set(idx,b.get(i));
            b.set(i, temp);
        }

        for(int i = 0; i < n; i++) {
            result += a.get(i) * b.get(i);
        }

        System.out.println(result);
    }
}