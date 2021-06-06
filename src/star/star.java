// Practice #4
package star;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line number: ");
		double number = sc.nextDouble();

		for (int i = 1; i < number + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}