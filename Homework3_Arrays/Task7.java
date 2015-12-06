import java.util.Scanner;

/*
 * Задача 7:
 * Напишете програма, която първо чете масив и после създава нов
 * масив със същия размер по следния начин: стойността на всеки
 * елемент от втория масив да е равна на сбора от предходния и
 * следващият елемент на съответния елемент от първия масив.
 * Да се изведе получения масив.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на масива: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int index = 0; index < array.length; index++) {
			System.out.print("Въведете " + (index + 1) + "-тия елемент: ");
			array[index] = sc.nextInt();
		}
		int[] finalArray = new int[n];
		// finalArray[0] = array[1] + array[array.length - 1];
		// finalArray[n - 1] = array[n - 2] + array[0];
		for (int index = 0; index < finalArray.length; index++) {
			if (index == 0) {
				finalArray[index] = array[index + 1] + array[array.length - 1];
			} else {
				if (index == finalArray.length - 1) {
					finalArray[index] = array[index - 1] + array[array.length - 1 - index];
				} else {
					finalArray[index] = array[index - 1] + array[index + 1];
				}
			}
		}
		for (int index = 0; index < finalArray.length; index++) {
			System.out.print("Полученият масив е: " + finalArray[index] + " ");
		}
		sc.close();
	}
}