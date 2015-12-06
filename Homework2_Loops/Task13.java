import java.util.Scanner;

/*
 * ������ 13: �� �� ������� ��������, ����� ������� ������
 * ���������� ���������� �����, ����� ���� ���� �� ������� �����
 * �� ������ �����.
 * ������ : sum, ������ 2>=sum<=27.
 * ������: 26
 * �����: 899, 989, 998.
 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����: ");
		byte sum = sc.nextByte();
		if (sum >= 2 && sum <= 27) {
			for (int index = 100; index < 1000; index++) {
				int hundred = (index / 100) % 10;
				int ten = (index / 10) % 10;
				int one = index % 10;
				if ((one + ten + hundred) == sum) {
					System.out.print(index + " ");
				}
			}
		} else {
			System.out.println("���������� �����!");
		}
	}

}