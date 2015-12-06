import java.util.Scanner;

/*
 * Задача 6: Да се прочете число от екрана(конзолата) и да се
 * изведе сбора на всички числа между 1 и въведеното число.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		int sumOfNumbers = 0;
		if (number >= 1) {
			for (int index = 1; index <= number; index++) {
				sumOfNumbers += index;
			}
		} else {
			for (int index = number; index <= 1; index++) {
				sumOfNumbers += index;
			}
		}
		System.out.println("Резултатът е: " + sumOfNumbers);
		sc.close();
	}
}
