/*
 * ������ 3: �� �� ������� �� ������ ������ ������� ����� �� -10 �� 10
 */
public class Task3 {

	public static void main(String[] args) {
		for (int index = -10; index <= 10; index++) {
			if (!(index % 2 == 0)) {
				System.out.print(index + " ");
			}
		}
	}
}
