package LandTicket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ageCal {
	public int getAge() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seperateId = new ArrayList<>();
		LocalDate now = LocalDate.now();
		while (true) {
			seperateId.clear();
			System.out.println("13자리의 숫자를 입력 : ");
			String id = sc.nextLine();

			if (id.length() != 13) {
				System.out.println("다시 입력하세요 : ");
				id = sc.nextLine();
				continue;
			}

			for (int i = 0; i < id.length(); i++) {
				seperateId.add(Character.getNumericValue(id.charAt(i)));
			}
			int birthYear = 10 * seperateId.get(0) + seperateId.get(1);
			int birthMonth = 10 * seperateId.get(2) + seperateId.get(3);
			int birthDay = 10 * seperateId.get(4) + seperateId.get(5);
			int flag = seperateId.get(6);

			switch (flag) {
			case 1:
			case 2:
				birthYear =  birthYear + 1900;
				break;

			default:
				birthYear =  birthYear + 2000;
				break;
			}
			if ((birthYear > 12) || (birthYear) <=0 || (birthDay > 31)) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			switch (flag) {
			case 1:
			case 2:
				if (birthYear >= 1900 && birthYear <= 1999) {
					System.out.println("정확한 입력입니다");
					break;
				}
				else if (birthYear >= 2000) {
					System.out.println("잘못된 입력입니다. 다시입력해주세요");
					continue;
				}
			case 3:
			case 4:
				if (birthYear >= 2000 && birthYear <= 2999) {
					System.out.println("정확한 입력입니다");
					break;
				}
				else if (birthYear < 2000) {
					System.out.println("잘못된 입력입니다. 다시입력해주세요");
					continue;
				}
			}
			
			int age = now.getYear() - birthYear;
			if (birthMonth > now.getMonthValue() || birthMonth == now.getMonthValue() && birthMonth > now.getMonthValue()) age--;
			
			return age;
		}
	}
}
