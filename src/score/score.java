package score;

import java.util.Scanner;

public class score {

   public static void main(String[] args) {

      int[] age = new int[10];
      Scanner input = new Scanner(System.in);
      int sum =0;
      float count =0,avg = 0;
      
      System.out.println("�л��� ���� �Է��Ͻÿ�");
      for (int i = 0; i < 10; ++i) {
         age[i] = input.nextInt();
         for (int j = i; j <=i ; j++) {
            sum = sum + age[i];
         }   
         count++;
      }
      avg = sum / count;
      System.out.println("�л��� ���� (�հ� = " + sum + "��� = " + avg + ")");

      input.close();

   }

}