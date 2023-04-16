import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] intArr = new int[num][2];
		
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i][0] = sc.nextInt();
			intArr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(intArr, (int[] a, int[] b) -> {
			
			if(a[1] == b[1]) {
				return a[0] - b[0];
			} else {
				return a[1] - b[1];
			}
		});
		
		
		for(int i=0; i < intArr.length; i++) {
			System.out.println(intArr[i][0] + " " + intArr[i][1]);
		}
		
		
	}
}