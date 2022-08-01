import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x1, y1, x2, y2, x3, y3;

		x1 = sc.nextDouble();
		y1 = sc.nextDouble();

		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		x3 = sc.nextDouble();
		y3 = sc.nextDouble();

		System.out.printf("(%.1f, %.1f)", (x1 + x2 + x3) / 3, (y1 + y2 + y3) / 3);

		sc.close();

	}

}
