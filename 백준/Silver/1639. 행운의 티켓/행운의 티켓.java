import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int answer = 0;

        for(int i = 2; i <= str.length(); i+=2) {
            for(int j = 0; j <= str.length() - i; j++) {

                String x = str.substring(j, i + j);

                String str1 = x.substring(0, x.length() / 2);
                String str2 = x.substring(x.length() / 2, x.length());

                int int1 = calculSum(str1);
                int int2 = calculSum(str2);
                
                if(int1 == int2) {
                    answer = str1.length() * 2;
                }
            }
        }

        System.out.println(answer);
    }


    public static int calculSum(String str) {

        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i)) ;
        }

        return sum;
    }
}