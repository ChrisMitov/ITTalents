import java.util.Scanner;

/*
 * Задача 17:
 * Да се състави програма, която извежда квадрат, чийто страни са
 * оформени със знака *, а вътрешността е запълнена със въведен
 * знак.
 * Входни данни b - дължина на страната число от интервала
 * [3..20], c - желан знак.
 * Програмата да използва цикъл for.
 */
public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете размерност и символ: ");
		int number = sc.nextInt();
		char symbol = sc.next().charAt(0);
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (i == number-1 || j == 0) {
					System.out.print("* ");
				} else if (j == number-1) {
					System.out.println("* ");
				} else if (i == 0) {
					System.out.print("* ");
				} else {
					System.out.print(symbol + " ");
				}
			}
		}
	}
}