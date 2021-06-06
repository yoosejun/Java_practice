package temp2;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("È­¾¾: ");
		float temperature = sc.nextFloat();
		double C = ((float) temperature - 32.0) * (5 / 9.0f);

		System.out.println("È­¾¾: " + temperature);
		System.out.println("¼·¾¾: " + C);
	}

}
