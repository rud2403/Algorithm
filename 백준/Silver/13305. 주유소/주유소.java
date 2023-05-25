import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 지하의 개수
        String[] m = br.readLine().split(" "); // 도로
        String[] l = br.readLine().split(" "); // 도시
        int result = 0;

        ArrayList<Integer> road = new ArrayList<>();
        ArrayList<Integer> city = new ArrayList<>();
        ArrayList<Integer> minCity = new ArrayList<>();

        // 도로 세팅
        for (int i = 0; i < m.length; i++) {
            road.add(Integer.parseInt(m[i]));
        }

        // 도시 세팅
        for(int i = 0; i < l.length; i++) {
            city.add(Integer.parseInt(l[i]));
            minCity.add(Integer.parseInt(l[i]));
        }
        minCity.remove(city.size() - 1);
        int min = Collections.min(minCity);
        for(int i = 0; i < city.size() - 1; i++) {
            // 최소값인지 확인
            if(city.get(i) != min) { // 만약 최소값 아니면 건널정도만 구매
                result += city.get(i) * road.get(i);
            } else {
                for(int j = i; j < city.size() - 1; j++) { // 최소값이면 앞으로 건널 거리까지 총 구매
                    result += city.get(i) * road.get(j);
                }
                break;
            }
        }

        System.out.println(result);

    }
}