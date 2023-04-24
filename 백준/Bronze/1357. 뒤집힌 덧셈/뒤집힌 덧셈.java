import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");

        StringBuilder sb1 = new StringBuilder(strArr[0]);
        int int1 = Integer.parseInt(sb1.reverse().toString());

        StringBuilder sb2 = new StringBuilder(strArr[1]);
        int int2 = Integer.parseInt(sb2.reverse().toString());

        int sum = int1 + int2;

        StringBuilder sb3 = new StringBuilder(String.valueOf(sum));
        int int3 = Integer.parseInt(sb3.reverse().toString());

        String result = String.valueOf(int3);

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}