// Practice #3
package MultiplicationTable;

public class multiplicationtable {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(String.format("** %d ´Ü **", i));
			for (int j = 1; j < 10; j++) {
				System.out.println(String.format("%d x %d = %d", i, j, i * j));
			}
		}

	}

}
