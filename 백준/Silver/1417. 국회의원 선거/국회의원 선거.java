import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int one = 0;
        int result = 0;
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < count; i++) {
            if(i == 0) {
                one = Integer.parseInt(br.readLine());
            } else {
                pq.add(Integer.parseInt(br.readLine()));
            }
        }

        if(count == 1) {
            System.out.println(0);
            return;
        }

        while (pq.peek() >= one) {
            one += 1;
            pq.add(pq.poll() - 1);
            result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}


