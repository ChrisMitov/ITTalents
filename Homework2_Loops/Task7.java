import java.util.Scanner;

/*
 * ������ 7: ���������� �� 3, �� �� ������� �� ������ ������� n
 * ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
 */
public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� n: ");
		int numbers = sc.nextInt();
		for (int index = 3; index <= 3 * numbers; index++) {
			if (index % 3 == 0) {
				System.out.print(index);
				if (index < 3 * numbers - 2) {
					System.out.print(",");
				}
			}
		}
	}
}