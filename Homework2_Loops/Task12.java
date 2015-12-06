/*
 * Задача 12: 
 * Да се състави програма, която извежда всички 
 * естествени трицифрени числа, които нямат еднакви цифри т.е.
 * 100,101, 606 и т.н. не се извеждат
 */
public class Task12 {

	public static void main(String[] args) {
		for (int index = 100; index < 1000; index++) {
			int hundred = (index / 100) % 10;
			int ten = (index / 10) % 10;
			int one = index % 10;
			// Проверяваме дали цифрите на числото са различни
			if (hundred != ten && hundred != one && ten != one) {
				System.out.print(index + " ");
			}
		}
	}
}