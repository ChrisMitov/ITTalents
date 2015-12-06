import java.util.Scanner;

/*
 * Задача 10: Въведете число от клавиатурата и определете дали е
 * просто. Просто число е това което се дели САМО на 1 и на себе
 * си.
 */
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Просто е.");
		} else {
			System.out.println("Не е просто.");
		}
	}
}