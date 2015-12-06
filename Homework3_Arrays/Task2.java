import java.util.Scanner;

/*
 * Задача 2: 
 * Нека по въведен масив да се конструира нов, като половината му
 * елементи са точно като на оригиналния, а другите да са тези 
 * елементи, но в обратен ред. Последно, да се изведе новия масив 
 * на екрана.
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		// [4,3,5,6,7,8] -> [4,3,5,8,7,6]
		int[] arrayNew = new int[array.length];
		int k = 1;
		for (int i = 0; i < arrayNew.length; i++) {
			if (i <= (arrayNew.length - 1) / 2) {
				arrayNew[i] = array[i];
			} else {
				arrayNew[i] = array[array.length - k];
				k++;
			}
		}
		for (int i = 0; i < arrayNew.length; i++) {
			System.out.print(arrayNew[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}