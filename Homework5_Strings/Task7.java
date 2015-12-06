import java.util.Scanner;

/*
 * Задача 7:
 * Да се състави програма, която чете набор от думи разделени с
 * интервал.
 * Като резултат да се извеждат броя на въведените думи, както и броя
 * знаци в най-дългата дума.
 * Пример: asd fg hjkl
 * Изход: 3 думи, най-дългата е с 4 символа.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max) {
				max = arr[i].length();
			}
		}
		System.out.println(arr.length + " думи, " + "най-дългата е с " + max + " символа");
		sc.close();
	}

}
