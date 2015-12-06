import java.util.Scanner;

/*
 * Задача 9:
 * Да се състави програма, чрез която по въведен низ съдържащ букви,
 * цифри, знак минус '-' се извежда сборът на въведените числа като се
 * отчита знакът '-' пред съответното число.
 * Вход: asd-12sdf45-56asdf100
 * Изход:
 * -12
 * 45
 * -56
 * 100
 * Сума = 77
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String str = sc.next();
		// Разглеждаме всички неблагоприятни случаи : 1. да има поредица от
		// минуси 2. минус между букви 3.минус между цифри
		String str = "-12a-sd-----12s-----df45-56----a--sdf100";
		StringBuilder sb = new StringBuilder();
		boolean isMinus = true;// дали сме минали през -
		boolean isNewLine = false;// дали трябва нов ред
		boolean flag = true;
		boolean isNumber = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '-' && isMinus == true) {
				if (flag == true && isNewLine == true) {
					sb.append('\n');
					flag = false;
				}
				sb.append(c);
				isMinus = false;
				isNumber = true;
			} else if (Character.isDigit(c)) {
				sb.append(c);
				isMinus = true;
				isNewLine = true;
				flag = true;
				isNumber = false;
			} else {
				if (c == '-') {// mnojestvo ot minusi
					continue;
				} else if (isNewLine) {// bukvi
					if (isNumber) {// proverka dali e zapisan minus i sled tova
									// ima bukva i triem
						sb.deleteCharAt(sb.length() - 1);
					}
					sb.append('\n');
					flag = true;
					isNewLine = false;
				} else if (isMinus == false) {// proverka dali imame minus sled
												// cifra i sled tova ima bukva
					sb.deleteCharAt(sb.length() - 1);
					isMinus = true;
				}
			}
		}
		int sum = 0;
		String[] array = sb.toString().split("\n");
		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}
		System.out.println(sb);
		System.out.println("Сума: " + sum);
	}
}