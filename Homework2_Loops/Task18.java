import java.util.Scanner;

/*
 * Задача 18: 
 * Да се състави програма, чрез която се въвежда две числа от интервала [1..9].
 * Програмата да извежда таблицата за умножение.
 * Максималната стойност на множителите е определена от 2-те числа.
 */
public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете 2 числа: ");
		byte n = sc.nextByte();
		byte k = sc.nextByte();
		if (n >= 1 && n <= 9 && k >= 1 && k <= 9) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= k; j++) {
					System.out.println(i + "*" + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("Некоректни данни!");
		}
	}
}