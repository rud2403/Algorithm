import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalSum = 0;
        double scoreSum = 0;

        for(int i = 0; i < 20; i++) {
            String str = br.readLine();

            double score = Double.parseDouble(str.split(" ")[1]);
            double rank;

            String grade = str.split(" ")[2];

            if("A+".equals(grade)) {
                rank = 4.5;
            } else if("A0".equals(grade)) {
                rank = 4.0;
            } else if("B+".equals(grade)) {
                rank = 3.5;
            } else if("B0".equals(grade)) {
                rank = 3.0;
            } else if("C+".equals(grade)) {
                rank = 2.5;
            } else if("C0".equals(grade)) {
                rank = 2.0;
            } else if("D+".equals(grade)) {
                rank = 1.5;
            } else if("D0".equals(grade)) {
                rank = 1.0;
            } else if("F".equals(grade)){
                rank = 0.0;
            } else {
                continue;
            }

            totalSum += score * rank;

            if(!"P".equals(grade)) {
                scoreSum += score;
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);
    }
}