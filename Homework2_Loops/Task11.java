import java.util.Scanner;
/*
 * �������� ����� N ���� ��������� � ��������� ����
 * �������� ������� ���������� � �������� N
 * �a�� ������������ ���������� � ����������� ����� 
 * ����������, �� ����������.
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �������� �������� �� �����������: ");
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
		//���� � ������������� ����������.
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
