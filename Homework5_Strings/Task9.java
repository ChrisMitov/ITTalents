import java.util.Scanner;

/*
 * ������ 9:
 * �� �� ������� ��������, ���� ����� �� ������� ��� �������� �����,
 * �����, ���� ����� '-' �� ������� ������ �� ���������� ����� ���� ��
 * ������ ������ '-' ���� ����������� �����.
 * ����: asd-12sdf45-56asdf100
 * �����:
 * -12
 * 45
 * -56
 * 100
 * ���� = 77
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String str = sc.next();
		// ����������� ������ �������������� ������ : 1. �� ��� �������� ��
		// ������ 2. ����� ����� ����� 3.����� ����� �����
		String str = "-12a-sd-----12s-----df45-56----a--sdf100";
		StringBuilder sb = new StringBuilder();
		boolean isMinus = true;// ���� ��� ������ ���� -
		boolean isNewLine = false;// ���� ������ ��� ���
		boolean flag = true;
		boolean isNumber = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '-' && isMinus == true) {
				if (flag == true && isNewLine == true) {
					sb.append('\n');
					flag = false;
				}
				sb.append(c);
				isMinus = false;
				isNumber = true;
			} else if (Character.isDigit(c)) {
				sb.append(c);
				isMinus = true;
				isNewLine = true;
				flag = true;
				isNumber = false;
			} else {
				if (c == '-') {// mnojestvo ot minusi
					continue;
				} else if (isNewLine) {// bukvi
					if (isNumber) {// proverka dali e zapisan minus i sled tova
									// ima bukva i triem
						sb.deleteCharAt(sb.length() - 1);
					}
					sb.append('\n');
					flag = true;
					isNewLine = false;
				} else if (isMinus == false) {// proverka dali imame minus sled
												// cifra i sled tova ima bukva
					sb.deleteCharAt(sb.length() - 1);
					isMinus = true;
				}
			}
		}
		int sum = 0;
		String[] array = sb.toString().split("\n");
		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}
		System.out.println(sb);
		System.out.println("����: " + sum);
	}
}