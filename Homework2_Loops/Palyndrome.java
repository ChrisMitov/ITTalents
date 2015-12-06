import java.util.Scanner;

/*
 * Задача 24: Едно число X е палиндром, aко се чете еднакво отпред назад и
 * отзад напред.
 * Да се състави програма, която проверява дали въведено число е палиндром.
 * Използвайте цикъл do-while.
 */
public class Palyndrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		int palindrome = number;
		int reverse = 0;
		do {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		} while (palindrome != 0);
		if (number == reverse) {
			System.out.println("Числото е палиндром!");
		} else {
			System.out.println("Числото не е палиндром!");
		}
	}
}