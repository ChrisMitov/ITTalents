import java.util.Scanner;

/*
 * ������ 10:
 * �� �� ������� ��������, ����� �� ����� ��� ����� ����,
 * ���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
 * �� ASCII ��������� � ���������� ������� 5 � � �������
 * ������������� ������.
 * ������ :
 * ����: Hello
 * �����: Mjqqt
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			char newLetter = (char)(word.charAt(i) + 5); 
			newWord +=newLetter;	
		}
		System.out.println(newWord);
		sc.close();
	}
}