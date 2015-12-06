/*
 * ������ 23:
 * �� �� ������� ��������, ����� ���� ����� while �������
 * ��������� �� ���������, �� ��� ����������.
 * �.�. ��� � �������� 4*5 �� �� ������� 5*4.
 * ������:
 * 1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
 * 2-�� �e�: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
 * ...
 * 9-�� ���: 9*9;
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		int i = 1, n = 9;
		while (i <= n) {
			int j = i;
			System.out.print(i + " ���: ");
			while (j <= n) {
				System.out.print(i + "*" + j + ";");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
