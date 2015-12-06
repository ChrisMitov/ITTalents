import java.util.Scanner;

/*
 * Задача 16:
 * Да се състави програма, чрез която се въвеждат 2 естествени
 * числа N, M от интервала [10..5555].
 * Програмата, чрез цикъл for, да извежда всички числа от
 * интервала, които са кратни на 50 в низходящ ред.
 */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число:");
		int n = sc.nextInt();
		System.out.println("Въведете число:");
		int m = sc.nextInt();
		// Разглеждаме 2 случая за интервала, взависимост кое от 2те числа е
		// по-голямо.
		if (m >= n) {
			for (int index = m; index >= n; index--) {
				if (index % 50 == 0) {
					System.out.print(index + " ");
				}
			}
		} else {
			for (int index = n; index >= m; index--) {
				if (index % 50 == 0) {
					System.out.print(index + " ");
				}
			}
		}
	}
}