import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int row = Integer.parseInt(s[0]);
        int col = Integer.parseInt(s[1]);

        int result = 0; // 누적 카운트

        ArrayList<Integer> arrList = new ArrayList<>(); // 이전 행의 |타일 위치
        ArrayList<Integer> preList = new ArrayList<>(); // 이전 행의 |타일 위치

        for(int i = 0; i < row; i++) {

            String s1 = br.readLine();
            int count = 0; // 사이클마다 초기화
            String pre = ""; // 이전 타일
            arrList.clear();

            for(int j = 0; j < col; j++) {
                String str = String.valueOf(s1.charAt(j));
                // - 인지 | 인지 검증해서 카운트 하기
                if("-".equals(str)) {
                    if("".equals(pre)) {
                        count++;
                        pre = "-";
                    } else if("|".equals(pre)) { // 이전 타일이 |인 경우
                        count++;
                        pre = "-";
                    }
                } else {
                    if(preList.size() > 0) {
                        if(preList.contains(j)){
                            pre = "|";
                            arrList.add(j);
                        } else {
                            count++;
                            pre = "|";
                            arrList.add(j);
                        }
                    } else {
                        count++;
                        pre = "|";
                        arrList.add(j);
                    }
                }

            }

            result += count;
            preList.clear();
            for (int o : arrList) {
                preList.add(o);
            }
        }
        System.out.println(result);
    }
}
