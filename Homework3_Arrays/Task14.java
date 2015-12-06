/*
 * Задача 14:
 * Имате предварително въведен едномерен масив, съдържащ реални
 * числа.
 * Да се състави програма, чрез която се избират само елементи със
 * стойности от интервала [-2.99..2.99] и новата редица се извежда на
 * екрана.
 * Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
 * Изход: 0.2; 0.99; 1.4; 1.2
 */
public class Task14 {

	public static void main(String[] args) {
		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2, -2.99, 0 };
		int count = 0;
		// Преброяване на броя елементи в масива, които удовлетворяват условията.
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= (-2.99) && array[index] <= 2.99) {
				count++;
			}
		}
		// Създаване на нов масив с тези числа.
		double[] finalArray = new double[count];
		// Въвеждането им в масива.
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= (-2.99) && array[index] <= 2.99) {
				finalArray[finalArray.length-count] = array[index];
				count--;
			}
		}
		// Извеждане на новата редица.
		for (int i = 0; i < finalArray.length; i++) {
			System.out.print(finalArray[i] + " ");
		}
	}
}