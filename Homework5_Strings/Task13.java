/*
 * Задача 13:
 * Да се създаде метод, който приема два масива от числа и връща
 * масив, съдържащ всички елементи на подадените масиви, като в
 * първата част на масива са елементите на първия подаден масив,
 * а във втората част – тези на втория подаден масив.
 */
public class Task13 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 192, 0, 1, -5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] array = concateArrays(arr1, arr2);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	static int[] concateArrays(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < newArr.length; i++) {
			if (i < arr1.length) {
				newArr[i] = arr1[i];
			} else {
				newArr[i] = arr2[i - arr1.length];
			}
		}
		return newArr;
	}
}