import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int h;
		int m;
		int n;
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		
		if(m + n >= 60) {
			int tmp = (m + n) / 60;
			h = h + (tmp);
			if(h > 23) {
				h = h - 24;
			}
			m = (m + n) % 60;
		} else {
			m = m + n;
		}
		System.out.println(h + " " + m);

	}

}