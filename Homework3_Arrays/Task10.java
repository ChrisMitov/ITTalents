import java.util.Scanner;

/*
 * Задача 10:
 * Да се състави програма, чрез която се въвеждат 7 цели числа в
 * едномерен масив.
 * Програмата да изведе числото, което е най-близко до средната
 * стойност на въведените числа.
 * Пример: 1,2,3,4,5,6,7
 * Изход: средна стойност 4, най-близка стойност 4
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете желания брой елементи: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		double avg = sum / array.length; // средна стойност
		System.out.println("Средна стойност: " + avg);
		double[] minDifference = new double[array.length];
		for (int i = 0; i < minDifference.length; i++) {
			double sub = array[i] - avg;
			minDifference[i] = Math.abs(sub);
		}
		double min = minDifference[0];
		int minIndex = 0;
		for (int i = 1; i < minDifference.length; i++) {
			if (min > minDifference[i]) {
				min = minDifference[i];
				minIndex = i;
			}
		}
		System.out.println("Елемент най-близък до тази стойност:" + array[minIndex]);
		sc.close();
	}

}
