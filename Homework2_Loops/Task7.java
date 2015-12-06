import java.util.Scanner;

/*
 * Задача 7: Започвайки от 3, да се изведат на екрана първите n
 * числа които се делят на 3. Числата да са разделени със запетая.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете n: ");
		int numbers = sc.nextInt();
		for (int index = 3; index <= 3 * numbers; index++) {
			if (index % 3 == 0) {
				System.out.print(index);
				if (index < 3 * numbers - 2) {
					System.out.print(",");
				}
			}
		}
	}
}