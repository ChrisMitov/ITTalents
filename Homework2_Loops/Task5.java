import java.util.Scanner;
/*
 * Задача 5: Да се въведат от потребителя 2 числа. И да се
 * изведат на екрана всички числа от по-малкото до по-голямото.
 */

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първото число: ");
		int first = sc.nextInt();
		System.out.print("Въведете второто число: ");
		int second = sc.nextInt();
		if (first < second) {
			for (int i = first; i <= second; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = second; i <= first; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}