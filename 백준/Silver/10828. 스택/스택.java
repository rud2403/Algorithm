import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        int n = Integer.parseInt(br.readLine()); // 명령의 수
//        String commend; // 명령어 종류
        int num; // push에 들어갈 숫자


        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
//                commend = str.split(" ")[0];
                num = Integer.parseInt(str.split(" ")[1]);

                list.add(num);
            } else if ("pop".equals(str)) {
                if(list.size() != 0) {
                    int m = list.get(list.size() - 1);
                    list.remove(list.size() - 1);

                    System.out.println(m);
                } else {
                    System.out.println(-1);
                }
            } else if ("size".equals(str)) {
                System.out.println(list.size());
            } else if ("empty".equals(str)) {
                if(list.size() == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if(list.size() != 0) {
                    System.out.println(list.get(list.size() - 1));
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}