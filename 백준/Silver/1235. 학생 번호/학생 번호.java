import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        int result = 0;


        String[] strArr = new String[k];

        for (int i = 0; i < k; i++) {
            strArr[i] = bf.readLine();
        }

        for (int i = strArr[0].length() - 1; i >= 0; i--) {
            HashSet hs = new HashSet<>();
            result++;
            for (int j = 0; j < k; j++) {
                String substring = strArr[j].substring(i, strArr[0].length());
                hs.add(substring);
            }
            if(hs.size() == k) {
                System.out.println(result);
                break;
            }
        }
    }
}