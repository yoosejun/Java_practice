package temp2;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ȭ��: ");
		float temperature = sc.nextFloat();
		double C = ((float) temperature - 32.0) * (5 / 9.0f);

		System.out.println("ȭ��: " + temperature);
		System.out.println("����: " + C);
	}

}
