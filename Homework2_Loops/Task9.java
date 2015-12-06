import java.util.Scanner;

/*
 * Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
 * Да се изведат всички числа от А до В на степен 2(разделени с
 * запетая).Ако някое число е кратно на 3, да се изведе съобщение че
 * числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
 * пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете А: ");
		int firstNumber = sc.nextInt();
		System.out.print("Въведете B: ");
		int secondNumber = sc.nextInt();
		int sum = 0;
		// Ако А>В.
		if (firstNumber > secondNumber) {
			int tmp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = tmp;
		}
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i % 3 == 0) {
				System.out.print("skip 3, ");
			} else {
				if (sum > 200) {
					break;
				} else {
					System.out.print(Math.pow(i, 2) + ", ");
					sum += Math.pow(i, 2);
				}
			}
		}
	}
}
