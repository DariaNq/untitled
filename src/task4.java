
import java.util.Scanner;

public class task4 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        task4 task4 = new task4();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a = ");
        double a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("b = ");
        double b = Integer.parseInt(iScanner.nextLine());
        System.out.printf("a^b = %.2f", task4.exponentiation(a, b));


    }

    public double exponentiation(double a, double b){
        double result = Math.pow(a, b);
        return result;
    }
}