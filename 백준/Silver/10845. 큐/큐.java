import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String str = br.readLine();

            if(str.contains("push")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                list.add(num);
            } else if("pop".equals(str)) {
                if(list.isEmpty()){ // 리스트가 비어있을 경우
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(0));
                    list.remove(0);
                }
            } else if("size".equals(str)) {
                System.out.println(list.size());
            } else if("empty".equals(str)) {
                if(list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if("front".equals(str)) {
                if(list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(0));
                }
            } else { // back인 경우
                if(list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(list.size() - 1));
                }
            }
        }
    }
}