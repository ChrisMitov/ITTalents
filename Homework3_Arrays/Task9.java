import java.util.Scanner;

/*
 * Задача 9:
 * Напишете програма, в която потребителя въвежда масив, след което
 * елементите на масива се обръщат в обратен ред (Целта не е масива да
 * се отпечата в обратен ред, ами първо да се обърне, след което да се
 * отпечата в нормален ред). Пробвайте да решите задачата първо с един
 * допълнителен масив и после без да използвате друг масив.
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете желания брой елементи: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
