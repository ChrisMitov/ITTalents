import java.util.Scanner;

/*
 * ������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
 * ������ ����� �� 1 �� �������� ����� N.
 * ����������� ����� do-while.
 */
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� N: ");
		int number = sc.nextInt();
		int x = 1;
		int sum = 0;
		do {
			sum += x;
			x++;
		} while (x <= number);
		System.out.println(sum);
	}

}
