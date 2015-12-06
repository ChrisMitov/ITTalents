import java.util.Scanner;

/*
 * Задача 18:
 * Дадени са два едномерни масива с естествени числа.
 * Да се състави програма, която сравнява всички числа с еднакви
 * индекси от двата масива и записва в трети масив, по-голямото от
 * двете числа.
 * Да се изведе съдържанието и на трите масива
 * Пример:
 * 18,19,32,1,3, 4, 5, 6, 7, 8
 * 1, 2, 3,4,5,16,17,18,27,11
 * Изход: 
 * 18,19,32 ,4,5,16,17,18,27,11
 */

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на първия масив: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		System.out.print("Въведете дължина на втория масив: ");
		int m = sc.nextInt();
		int[] array2 = new int[m];
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array2[i] = sc.nextInt();
		}
		int[] finalArray = new int[n];
//		int[] array = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
//		int[] array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
//		int[] finalArray = new int[array.length];
		if (array.length != array2.length) {
			System.out.println("Масивите са с различна дължина!");
		} else {
			for (int index = 0; index < array.length; index++) {
				if (array[index] >= array2[index]) {
					finalArray[index] = array[index];
				} else {
					finalArray[index] = array2[index];
				}
			}
		}
		System.out.println("Първият масив е:");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println('\n' + "Вторият масив е:");
		for (int index = 0; index < array2.length; index++) {
			System.out.print(array2[index] + " ");
		}
		System.out.println('\n' + "Крайният масив е: ");
		for (int index = 0; index < finalArray.length; index++) {
			System.out.print(finalArray[index] + " ");
		}
		sc.close();
	}
}