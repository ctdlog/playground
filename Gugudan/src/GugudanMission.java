import java.util.Scanner;

public class GugudanMission {

	public static void main(String[] args) {
		// ����� �� ����
		System.out.println("������ �� ����� �� 2���� �Է����ּ���. : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		// ��ǥ �������� �и��ϱ�
		String[] splitedValue = inputValue.split(",");
		// �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println("����ڰ� �Է��� �� : " + first + ", " + second);
		
		if (first < 2) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else if (first > 19) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else {
			for(int i = 2; i <= first; i++) {
				for(int j = 1; j <= second; j++) {
					System.out.println(i * j);
					
				}
			}
		}
	}
	
}