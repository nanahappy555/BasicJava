package chapter10Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise112 {

   public static void main(String[] args) {
      int one = 0;
      do {
         try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("어떤 수를 나누겠습니까?>>");
            int number1 = scanner.nextInt();
            System.out.print("어떤 수로 나누겠습니까?>>");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
            System.out.printf("%d / %d = " + result, number1, number2);
            one++;
//            break;
         } catch (InputMismatchException a) {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
         }
         catch (ArithmeticException b) {
            System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
         }
      } while (one == 0);
   }
}

