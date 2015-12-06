import java.util.Scanner;

/*
 * Задача 21:
 * Дадено е наредено тесте карти.
 * Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо.
 * Наредбата по цвят на картите е: спатия, каро, купа, пика.
 * Да се създаде програма, чрез която се въвежда N - число от
 * интервала [1..51] и се извеждат въведения номер карта и
 * останалите по-големи карти от тестето.
 */
public class Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number = sc.nextInt();
		String[] paints = { "пика", "спатия", "каро", "купа" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Вале", "Дама", "Поп", "Асо" };
		for (int index = number; index <= 52; index++) {
			if (index == 52) {
				System.out.print(cards[(index - 1) / 4] + " " + paints[index % 4]);
			} else {
				System.out.print(cards[(index - 1) / 4] + " " + paints[index % 4] + ", ");
			}
		}
	}
}