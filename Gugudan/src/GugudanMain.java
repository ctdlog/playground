import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		for (int i = 2; i < 20; i++) {
			int[] result = GugudanArray.calculate(i);
			System.out.println(i + "단입니다.");
			GugudanArray.print(result);
		}

	}
	
}
