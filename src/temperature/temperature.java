// Practice #1
package temperature;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		float temperature = sc.nextFloat();
		double F = ((float) temperature * (9 / 5.0f)) + 32.0;

		System.out.println("����: " + temperature);
		System.out.println("ȭ��: " + F);
	}
}
