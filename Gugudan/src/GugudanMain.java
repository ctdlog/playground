import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + number);
		
		for (int i = 2; i < 20; i++) {
			int[] result = GugudanArray.calculate(i);
			System.out.println(i + "���Դϴ�.");
			GugudanArray.print(result);
		}

	}
	
}
