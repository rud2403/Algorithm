import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int noL = Integer.parseInt(s[0]);
        int noS = Integer.parseInt(s[1]);

        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < noL; i++) {
            hm.put(br.readLine(), 1);
        }

        for(int i = 0; i < noS; i++) {
            String str = br.readLine();
            if(hm.containsKey(str)){
                result.add(str);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String s1 : result) {
            System.out.println(s1);
        }

        br.close();
    }
}
