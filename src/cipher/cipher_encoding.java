// Practice #9
package cipher;

import java.util.Scanner;

public class cipher_encoding {

	public static void main(String[] args) {
		String input = "";
		String output = "";
		int tmp;

		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = (int) input.charAt(i);

			if (((68 <= tmp) && (tmp <= 87)) || ((100 <= tmp) && (tmp <= 119))) {
				output += (char) (tmp + 3);
			} else if (((65 <= tmp) && (tmp <= 67)) || ((97 <= tmp) && (tmp <= 99))) { // �빮��
				output += (char) (tmp + 23);
			} else if (((88 <= tmp) && (tmp <= 90)) || ((120 <= tmp) && (tmp <= 122))) { // �ҹ���
				output += (char) (tmp - 23);
			} else { // ��Ÿ
				output += (char) tmp;
			}
		}
		System.out.println("��ȣ: " + output);

	}

}
