import java.util.Scanner;

/*
 * Задача 15: Да се състави програма, която да изчисли сумата на
 * всички числа от 1 до въведено число N.
 * Използвайте цикъл do-while.
 */
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете N: ");
		int number = sc.nextInt();
		int x = 1;
		int sum = 0;
		do {
			sum += x;
			x++;
		} while (x <= number);
		System.out.println(sum);
	}

}
