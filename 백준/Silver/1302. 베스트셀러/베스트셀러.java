import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            String name = br.readLine();
            if(!hm.containsKey(name)) { // 키 값이 없으면 1로 추가
                hm.put(name, 1);
            } else { // 이미 있으면 value 값 +1
                hm.replace(name, hm.get(name) + 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(hm.entrySet());
        Collections.sort(entries, (o1, o2) -> {
            if(o1.getValue().equals(o2.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue().compareTo(o1.getValue());
        });


        System.out.println(entries.get(0).getKey());
    }
}
