import java.util.Scanner;

/*
 * Задача 5:
 * Да се състави програма, чрез която се въвеждат 2 редици от знаци
 * (думи).
 * Ако в двете редици участва един и същи знак, да се изведе на екрана
 * първата редица хоризонтално, а втората вертикално, така че да се
 * пресичат в общия си знак.
 * Ако редиците нямат общ знак да се изведе само уведомително
 * съобщение.
 */

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
//		String str1 = "лопата";
//		String str2 = "гарга";
		int[] arr = new int[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			arr[i] = str2.indexOf(str1.charAt(i));
		}
		int min = min(arr);
		if (min < 0) {
			System.out.println("Нямат съвпадащи букви.");
			return;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (i == min) {
				System.out.print(str2);
			} else {
				for (int j = 0; j < arr[min]; j++) {
					System.out.print(" ");
				}
				System.out.print(str1.charAt(i));
			}
			System.out.println();
		}
	}

	static int min(int[] arr) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				index = i;
				break;
			}
		}
		return index;
	}
}