import java.util.Scanner;

/*
 * Задача 14: Да се състави програма, която по въведено
 * естествено число N от интервала [10..200] извежда в обратен
 * ред всички числа, които са кратни на 7 и са по-малки от N.
 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		if (number >= 10 && number <= 200) {
			for (int index = 200; index >= 10; index--) {
				if (index % 7 == 0 && index < number) {
					System.out.print(index + " ");
				}
			}
		} else {
			System.out.print("Некоректни данни!");
		}
		sc.close();
	}
}