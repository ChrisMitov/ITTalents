/*
 * ������ 12: 
 * �� �� ������� ��������, ����� ������� ������ 
 * ���������� ���������� �����, ����� ����� ������� ����� �.�.
 * 100,101, 606 � �.�. �� �� ��������
 */
public class Task12 {

	public static void main(String[] args) {
		for (int index = 100; index < 1000; index++) {
			int hundred = (index / 100) % 10;
			int ten = (index / 10) % 10;
			int one = index % 10;
			// ����������� ���� ������� �� ������� �� ��������
			if (hundred != ten && hundred != one && ten != one) {
				System.out.print(index + " ");
			}
		}
	}
}