import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 사람 수
        String[] strArr = br.readLine().split(" ");
        int sum = 0;
        int result = 0;
        ArrayList<Integer> intArr = new ArrayList<>();

        for(int i = 0; i < n; i++ ){
            intArr.add(Integer.parseInt(strArr[i]));
        }

        Collections.sort(intArr);

        for(int i = 0; i < intArr.size(); i++) {
            sum = sum + intArr.get(i);
            result += sum;
        }

        System.out.println(result);

    }
}