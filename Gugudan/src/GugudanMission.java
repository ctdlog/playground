import java.util.Scanner;

public class GugudanMission {

	public static void main(String[] args) {
		// 출력할 단 묻기
		System.out.println("구구단 중 출력할 단 2개를 입력해주세요. : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		// 쉼표 기준으로 분리하기
		String[] splitedValue = inputValue.split(",");
		// 입력받은 문자열을 숫자로 변환
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		System.out.println("사용자가 입력한 값 : " + first + ", " + second);
		
		if (first < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if (first > 19) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
			for(int i = 2; i <= first; i++) {
				for(int j = 1; j <= second; j++) {
					System.out.println(i * j);
					
				}
			}
		}
	}
	
}