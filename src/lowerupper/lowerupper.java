// Practice #8
package lowerupper;

import java.util.Scanner;

public class lowerupper {

	public static void main(String[] args) {
		String input = "";
		String output = "";
		int tmp;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String: ");
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = (int) input.charAt(i);

			if ((65 <= tmp) && (tmp <= 90)) {         // �빮��
				output += (char) (tmp + 32);
			} else if ((97 <= tmp) && (tmp <= 122)) { // �ҹ���
				output += (char) (tmp - 32);
			} else {                                  // ��Ÿ
				output += (char) tmp;
			}
		}
		System.out.println("Changed String: " + output);
	}

}
