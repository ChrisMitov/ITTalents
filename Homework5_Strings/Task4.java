import java.util.Scanner;

/*
 * Задача 4:
 * Да се състави програма, чрез която по въведени трите имена на двама
 * човека разделени със запетая, се извежда чие име има по-голям сбор
 * от ASCII кодовете на съставящите името букви.
 * Пример: Anna Dosewa Asenowa, Iwo Peew Peew
 * Изход: Anna Dosewa Asenowa
 */
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(",");
		if (arr.length > 2) {
			System.out.println("Въведени са повече от 2 имена.");
			return;
		}
		int maxSum = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				sum += (int) arr[i].charAt(j);
			}
			if (maxSum <= sum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(arr[index]);
		sc.close();
	}
}