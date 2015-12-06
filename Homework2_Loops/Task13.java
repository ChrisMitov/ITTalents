import java.util.Scanner;

/*
 * Задача 13: Да се състави програма, която извежда всички
 * естествени трицифрени числа, които имат сбор на цифрите равен
 * на дадено число.
 * Дадено : sum, където 2>=sum<=27.
 * Пример: 26
 * Изход: 899, 989, 998.
 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете сума: ");
		byte sum = sc.nextByte();
		if (sum >= 2 && sum <= 27) {
			for (int index = 100; index < 1000; index++) {
				int hundred = (index / 100) % 10;
				int ten = (index / 10) % 10;
				int one = index % 10;
				if ((one + ten + hundred) == sum) {
					System.out.print(index + " ");
				}
			}
		} else {
			System.out.println("Некоректни данни!");
		}
	}

}