package String_ex;

import java.util.Scanner;

public class String_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();

		boolean isEng = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				isEng = true;
			} else if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				isEng = true;
			} else {
				isEng = false;
			}
		}
		if (isEng == false) {

			System.out.println("�����ڰ� �ƴմϴ�.");

		} else {

			System.out.print("���� �Է� : ");
			char ch = sc.next().charAt(0);

			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println("���Ե� ����: " + count);
		}
	}

}
