// Practice #10
package arithmetic_operation;

import java.util.Scanner;

public class arithmetic_operation {

	static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	static int subtract(int a, int b) {
		int result = a - b;
		return result;
	}

	static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	static double divide(int a, int b) {
		try {
			double result = (int) a / b;
			return result;
		} catch (ArithmeticException e) {
			System.out.println("Divided error: could not devide with 0");
		}
		double result = (int) a / b;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arithmetic_operation op = new arithmetic_operation();
		System.out.print("Enter the fomular: ");
		int a = sc.nextInt();
		char oper = sc.next().charAt(0);
		int b = sc.nextInt();

		switch (oper) {
		case '+':
			System.out.print(op.add(a, b));
			break;
		case '-':
			System.out.print(op.subtract(a, b));
			break;
		case '*':
			System.out.print(op.multiply(a, b));
			break;
		case '/':
			System.out.print(op.divide(a, b));
			break;

		}

	}

}
