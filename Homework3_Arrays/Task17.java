import java.util.Scanner;

/*
 * Задача 17:
 * Една редица от естествени числа ще наричаме зигзагообразна нагоре,
 * ако за елементите и са изпълняват условията:
 * N1 < N2 > N3 < N4 > N5 <..
 * Съставете програма, която проверява дали въведени в едномерен
 * масив редица от числа изпълняват горните изисквания.
 * Пример: 1 3 2 4 3 7
 * Изход: изпълнява изискванията за зигзагообразна нагоре редица
 */
public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете желания брой елементи: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Въведете " + (i+1) + "-тия елемент: ");
			array[i] = sc.nextInt();
		}
		boolean isCorrect = true;
		for (int index = 1; index < array.length-1; index++) {
			boolean isBiggerThanNeighbors = (array[index] > array[index+1]) && (array[index] > array[index-1]);
			boolean isLowerThanNeighbors = (array[index] < array[index+1]) && (array[index] < array[index-1]);
			
			if (!(isBiggerThanNeighbors || isLowerThanNeighbors)) {
				isCorrect = false;
				break;
			}
		}
		if (isCorrect) {
			System.out.println("изпълнява изискванията за зигзагообразна нагоре редица");
		} else {
			System.out.println("не изпълнява изискванията за зигзагообразна нагоре редица");
		}
		sc.close();
	}
}