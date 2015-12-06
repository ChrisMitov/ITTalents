import java.util.Scanner;
/*
 * Задача 11:
 * Да се състави програма, която въвежда от клавиатурата 7 цели числа
 * в едномерен масив
 * Програмата да изведе всички числа кратни на 5, но по големи от 5.
 * Пример: -23, -55, 17, 75, 56, 105, 134
 * Изход: 75,105, 2 числа
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 7 числа: ");
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + ", ");
				k++;
			}
		}
		System.out.println(k + " числа");
		sc.close();
	}
}