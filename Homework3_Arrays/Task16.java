import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Задача 16:
 * Да се състави програма, чрез която предварително въведени 10
 * реални числа от интервала се обработват по следния начин:
 * 1. Извежда съществуващите числа.
 * 2. Всички елементи със стойност по-малки от -0.231 се заменят със
 * сумата от квадрата на индекса им + числото 41.25, а всички останали
 * елементи се заменят с произведението между самия елемент и
 * неговият пореден номер
 * 3. Да се изведат елементите от началния и новообразувания масив.
 * 4. Да се изведат средната стойност на всички елементи от новата
 * редица, които са различни от 0.
 * Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
 * Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Използваме закръгляне след втория знак, защото се получават числа с
		// много цифри след запетаята.
		DecimalFormat df = new DecimalFormat("#.##");
		// double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextDouble();
		}
		// 1. Извежда съществуващите числа.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// 2. Всички елементи със стойност по-малки от -0.231 се заменят със
		// сумата от квадрата на индекса им + числото 41.25, а всички останали
		// елементи се заменят с произведението между самия елемент и неговият
		// пореден номер
		double[] secondArray = new double[array.length];
		for (int i = 0; i < secondArray.length; i++) {
			if (array[i] < (-0.231)) {
				secondArray[i] = Math.pow((i + 1), 2) + 41.25;
			} else {
				secondArray[i] = array[i] * (i + 1);
			}
		}
		System.out.println();
		// 3. Да се изведат елементите от началния и новообразувания масив.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		double sum = 0;
		int k = 0;
		System.out.println();
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(df.format(secondArray[i]) + " ");
			if (secondArray[i] != 0) {
				sum += secondArray[i];
				k++;
			}
		}
		// 4. Да се изведат средната стойност на всички елементи от новата
		// редица, които са различни от 0.
		System.out.println('\n' + "Сумата е:" + df.format(sum / k));
		sc.close();
	}
}