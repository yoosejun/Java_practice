package even_sum;

import java.util.Scanner;

public class even_sum {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = 0;
      int count = 0;

      do {
         System.out.print("���� ������ �Է��ϼ��� : ");
         number = input.nextInt();

         if (number % 2 == 0)
            count = count + number;

      } while ((number >= 0));
      System.out.print("�Է��� ���� ���� �߿��� ¦���� ���� " + count);

      input.close();

   }

}