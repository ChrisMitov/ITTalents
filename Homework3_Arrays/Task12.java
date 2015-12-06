import java.util.Scanner;

/*
 * Задача 12:
 * Да се състави програма, чрез която по предварително въведени 7
 * числа в едномерен масив се разменят местата на елементи с индекси:
 * - 0 и 1 чрез трета променлива;
 * - 2 и 3 чрез събиране;
 * - 4 и 5 чрез умножение.
 * Пример: 1,2,3,4,5,6,7
 * Изход: 2,1,4,3,6,5,7
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете 7 числа: ");
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// размяна на 0 и 1 чрез трета променлива;
		int tmp = array[0];
		array[0] = array[1];
		array[1] = tmp;
		// размяна на 2 и 3 на чрез събиране;
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		// размяна на 4 и 5 на чрез умножение;
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ",");
			} else {
				System.out.println(array[i]);
			}

		}
		sc.close();
	}
}
