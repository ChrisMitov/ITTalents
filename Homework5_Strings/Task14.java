import java.util.Scanner;

/*
 * ������ 14:
 * �� �� ������� �����, ����� ������ �� �������� ����� N � �����
 * ���������� �� N! (N ���������).
 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("���� ����������� ���������.");
		} else {
			System.out.println(factorial(number));
		}
		sc.close();
	}

	static long factorial(int n) {
		return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	}
}
