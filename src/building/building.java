package building;

import java.util.Scanner;

public class building {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("���� ��������: ");
      int number = input.nextInt();

      switch (number) {

      case 1:
         System.out.println("1�� �౹�Դϴ�.");
         break;
      case 2:
         System.out.println("2�� �����ܰ��Դϴ�.");
         break;
      case 3:
         System.out.println("3�� �Ǻΰ��Դϴ�.");
         break;
      case 4:
         System.out.println("4�� ġ���Դϴ�.");
         break;
      case 5:
         System.out.println("5�� �ｺŬ���Դϴ�.");
         break;
      default:
         System.out.println("�� �� �Է��ϼ̽��ϴ�.");
      }
      input.close();

   }

}