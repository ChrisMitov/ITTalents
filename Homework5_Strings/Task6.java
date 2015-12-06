import java.util.Scanner;

/*
 * Задача 6:
 * Да се състави програма, чрез която се въвежда изречение с отделни
 * думи.
 * Като резултат на екрана да се извежда същия текст, но всяка отделна
 * дума да започва с главна буква, а следващите я букви да са малки.
 * Пример: супер яката задача
 * Изход: Супер Яката Задача
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// Записаваме си в масив всички думи.
		String[] arr = str.split(" ");
		// Създаваме StringBuilder за да модифицираме низа.
		StringBuilder sb = new StringBuilder();
		// Създаваме низа, като първата буква на всяка дума става главна,
		// преписваме останалата част и добавяме разделител.
		for (int i = 0; i < arr.length; i++) {
			// Със stringbuilder-а си конструираме нов масив.(Друг начин за
			// решение на задачата).
			// sb.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1)).append(" ");

			// разделяме стринга на 2 и после го конкатенираме, след като сме
			// извършили операциите върху 2те части.
			// Много по-бавен метод от stringbuilder.
			arr[i] = (arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length()).toLowerCase());
		}
		// System.out.println(sb.toString().trim());
		str = String.join(" ", arr);
		System.out.println(str);
	}
}
