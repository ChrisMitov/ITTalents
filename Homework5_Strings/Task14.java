import java.util.Scanner;

/*
 * Задача 14:
 * Да се състави метод, който приема за стойност число N и връща
 * стойността на N! (N факториел).
 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Няма отрицателен факториел.");
		} else {
			System.out.println(factorial(number));
		}
		sc.close();
	}

	static long factorial(int n) {
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}
}
