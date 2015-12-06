import java.util.Scanner;

/*
 * Задача 1:
 * Да се състави програма, чрез която се въвеждат два низа съдържащи
 * до 40 главни и малки букви.
 * Като резултат на екрана да се извеждат низовете само с главни и само
 * с малки букви.
 * Пример: Abcd Efgh
 * Изход: ABCD abcd EFGH efgh
 */
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if (str1.length() > 40 || str2.length() > 40) {
			System.out.println("Низовете са по-дълги от 40 символа.");
			return;
		}
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase() + " ");
		System.out.print(str2.toUpperCase() + " " + str2.toLowerCase() + " ");
		sc.close();
	}
}