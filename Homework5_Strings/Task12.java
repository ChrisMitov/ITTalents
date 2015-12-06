import java.util.Scanner;

/*
 * Задача 12:
 * Да се създаде метод, който приема за входни данни число N и
 * връща масив от числа с дължина N, който съдържа всички числа
 * от 1 до N.
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете N: ");
		int number = sc.nextInt();
		int[] arr = createArray(number);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	static int[] createArray(int n) {
		int[] arr = new int[n];
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
		}
		return arr;
	}
}