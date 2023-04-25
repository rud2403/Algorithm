import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> integers = new ArrayList<>();

        int one = 0;
        int result = 0;

        int count = Integer.parseInt(br.readLine());


        for(int i = 0; i < count; i++) {
            if(i == 0) {
                one = Integer.parseInt(br.readLine());
            } else {
                integers.add(Integer.parseInt(br.readLine()));
            }
        }

        if(count == 1) {
            System.out.println(0);
            return;
        }
        Collections.sort(integers, Collections.reverseOrder());
        while (integers.get(0) >= one) {
            one += 1;
            integers.set(0, integers.get(0) - 1);

            Collections.sort(integers, Collections.reverseOrder());

            result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}


