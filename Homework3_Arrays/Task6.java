import java.util.Scanner;

/*
 * Задача 6:
 * Напишете програма, която първо чете 2 масива и после извежда
 * съобщение дали са еднакви, и дали са с еднакъв размер.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете размер на масива: ");
		int number = sc.nextInt();
		System.out.println("Въведете размер на масива: ");
		int nextNumber = sc.nextInt();
		int[] array = new int[number];
		int[] array2 = new int[nextNumber];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		System.out.println("Вторият масив: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Въведете " + (i + 1) + "-тия елемент: ");
			array2[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array2[i]) {
				isCorrect = false;
				break;
			}
		}
		// За да са еднакви трябва да са с еднаква дължина :)
		if (isCorrect && array.length == array2.length) {
			System.out.println("Еднакви са и са с еднаква дължина");
		} else {
			System.out.println("Не са еднакви са или с еднаква дължина");
		}
		sc.close();
	}

}
