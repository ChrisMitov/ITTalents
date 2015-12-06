import java.util.Scanner;

/* Задача 8:
 * Напишете програма, която намира и извежда най-дългата редица от
 * еднакви поредни елементи в даден масив.
 */
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дължина на масива: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int index = 0; index < array.length; index++) {
			System.out.print("Въведете " + (index + 1) + "-тия елемент: ");
			array[index] = sc.nextInt();
		}
		int counter = 0;
		int maxSequence = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			counter = 0;
			int j = i;
			while (array[j] == array[i]) {
				counter++;
				j++;
				if (j == array.length) {
					break;
				}
			}
			if (counter > maxSequence) {
				maxSequence = counter;
				index = i;
			}
		}
		for (int i = index; i < index + maxSequence; i++) {
			if (i != index + maxSequence - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		sc.close();
	}

}
