import java.util.Scanner;

/*
 * Задача 8:
 * Да се състави програма, чрез която се въвежда ред от символи
 * (стринг, низ).
 * Програмата да изведе на екрана дали въведения стринг е палиндром,
 * т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
 * Вход: капак
 * Изход: да.
 * Вход: тенджера
 * Изход: не.
 */
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// 1ви начин - с използване на допънителен стринг, който съдържа обърнат
		// наобратно въведения стринг
		// String reverse = "";
		// for (int i = str.length() - 1; i >= 0; i--) {
		// reverse += str.charAt(i);
		// }
		// if (str.equals(reverse)) {
		// System.out.println("Да.");
		// } else {
		// System.out.println("Не.");
		// }
		// sc.close();
		
		
		// 2ри начин - с булева променлива и проверка дали всяка двойка от
		// елементи на низа (в началото и края) са равни
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Да.");
		} else {
			System.out.println("Не.");
		}
		sc.close();
	}

}
