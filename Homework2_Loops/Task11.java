import java.util.Scanner;
/*
 * Въведете число N чрез конзолата и изкарайте като
 * резултат следния триъгълник с височина N
 * Кaто допълнително упражнение – нарисувайте същия 
 * триъгълник, но незапълнен.
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете желаната височина на триъгълника: ");
		int number = sc.nextInt();
		for (int i = 0; i < number*2; i += 2) {
			for (int j = number - (i / 2); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = number - (i / 2); j <= number + (i / 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Това е незапълненият триъгълник.
		for (int i = 0; i <= number * 2; i += 2) {
			for (int j = number - i / 2; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = number - i / 2; k <= number + i / 2; k++) {
				if ((k == number - i / 2 || k == number + i / 2)) {
					System.out.print("*");
				} else if (i == number * 2) {
					if (k % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
