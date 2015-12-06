import java.util.Scanner;

/*
 * Задача 25: Да се направи програма, която по дадено число N, да изчислява N!,
 * т.е. 1*2*3*4...*N. 
 * Използвайте цикъл do-while.
 */
public class Factoriel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете N: ");
		int fact = sc.nextInt();
		long sum = 1;
		do {
			sum *= fact;
			fact--;
		} while (fact > 0);
		System.out.println(sum);
	}

}
