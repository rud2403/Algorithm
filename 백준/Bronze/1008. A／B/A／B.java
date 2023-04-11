import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double a = x.nextDouble();
		double b = x.nextDouble();
		x.close();
		
		System.out.println(a / b);
	}

}