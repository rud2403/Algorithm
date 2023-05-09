import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>();
        String[] strArr = br.readLine().split(" ");

        for(int i = 0; i < count; i++) {
            intArr.add(Integer.valueOf(strArr[i]));
        }

        Collections.sort(intArr);

        int ob = Integer.parseInt(br.readLine());

        int start = 0;
        int end = intArr.size() - 1;
        int n = 0;
        int sum;

        while (start < end) {
            sum = intArr.get(start) + intArr.get(end);
            if(sum == ob) {
                n++;
            }

            if(sum <= ob) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(n);
    }
}