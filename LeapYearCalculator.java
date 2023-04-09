import java.util.Scanner;

//윤년계산 = 입력한 년도가 4로 나누어 떨어져야하는데, 100으로 나누어 떨어지면 윤년에서 제외, 근데 400으로 나누어 떨어지면 또 포함

public class LeapYearCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력받겠습니다. ");
		
		while(true) {
			System.out.println("그만하시겠습니까? y/n: ");
			char tmp = sc.next().charAt(0);
			
			if(tmp =='y' ) {
				System.out.println("그만하겠습니다.");
				break;
			}
			System.out.println("몇년을 원하십니까? : ");
			int year = sc.nextInt();
			System.out.println("몇월을 원하십니까? : ");
			int month = sc.nextInt();
			
			if(month>12 || month <1) {
				System.out.println("다시 입력하세요!!");
			}
			else {
				if(month == 2) {
					if(year%4==0 && ((year % 400==0) || year %100 !=0)) { System.out.println(year+"년 "+ month +"월 "+"은 윤년으로 29일 입니다.");}
					else { System.out.println(year+"년 "+ month +"월 "+"은 평년으로 28일 입니다.");}
				}
				else {
					switch(year) {
						case 1: case 3 : case 5: case 7: case 8: case 10 : case 12:
							System.out.println(year+"년 "+ month +"월 "+"은 31일입니다");
							break;
						default:
							System.out.println(year+"년 "+ month +"월 "+"은 30일입니다");
							break;
					}
				}
			}	
		}
		
	}
}
