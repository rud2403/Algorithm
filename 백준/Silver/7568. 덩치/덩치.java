import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] intArr = new int[num][2];
		int[] intArr2 = new int[num];
		
		
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i][0] = sc.nextInt();
			intArr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i < intArr.length; i++) {
			int sum = 1;
			for(int j=0; j < intArr.length; j++) {
				if( i != j) {
					if(intArr[i][0] < intArr[j][0] && intArr[i][1] < intArr[j][1]) {
						sum += 1;
					}
				}
			}
			intArr2[i] = sum;
		}
		
		
		for(int i=0; i < intArr2.length; i++) {
			System.out.println(intArr2[i]);
		}
		
	}
}