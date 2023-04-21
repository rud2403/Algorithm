import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Double[] dbArr = new Double[num];
		
		for(int i=0; i < num; i++) {
			dbArr[i] = sc.nextDouble();
		}
		
		Arrays.sort(dbArr, Collections.reverseOrder());

		Double max = dbArr[0];
		Double sum = 0.0;
		for(int i=0; i < dbArr.length; i++) {
			dbArr[i] = dbArr[i] / max * 100;
			sum += dbArr[i];
		}
		
		System.out.println(sum / num);
		
	}
}