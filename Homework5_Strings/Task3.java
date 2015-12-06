import java.util.Scanner;

/*
 * Задача 3:
 * Да се състави програма, чрез която се въвеждат последователно две
 * редици от символи без интервали.
 * Програмата да извежда съобщение за резултата от сравнението им по
 * позиции.
 * Пример: хипопотам, хипопотук
 * Изход: Двата низа са с равна дължина.
 * Разлика по позиции:
 * 8 а-у
 * 9 м-к
 */
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.next();
		String secondWord = sc.next();
		int n = 0;
		if (firstWord.length() > secondWord.length()) {
			System.out.println("Първата дума е по-дълга.");
			n = secondWord.length();
		} else {
			n = firstWord.length();
			if (firstWord.length() < secondWord.length()) {
				System.out.println("Втората дума е по-дълга.");
			} else {
				System.out.println("Двата низа са с равна дължина.");
			}
		}
		System.out.println("Разлика по позиции:");
		int p = 0;
		for (int i = 0; i < n; i++) {
			if (firstWord.charAt(i) != secondWord.charAt(i)) {
				System.out.println((i + 1) + " " + firstWord.charAt(i) + "-" + secondWord.charAt(i));
				p++;
			}
		}
		if (p == 0) {
			System.out.println("Няма разлика в думите.");
		}
	}
}