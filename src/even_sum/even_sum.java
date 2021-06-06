package even_sum;

import java.util.Scanner;

public class even_sum {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = 0;
      int count = 0;

      do {
         System.out.print("양의 정수를 입력하세요 : ");
         number = input.nextInt();

         if (number % 2 == 0)
            count = count + number;

      } while ((number >= 0));
      System.out.print("입력한 양의 정수 중에서 짝수의 합은 " + count);

      input.close();

   }

}