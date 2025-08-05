import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] original = new int[n];
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            set.add(original[i]);
        }

        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sorted.size(); i++) {
            map.put(sorted.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(map.get(original[i])).append(" ");
        }
        
        System.out.println(sb);

    }
}