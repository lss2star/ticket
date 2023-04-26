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
			System.out.println("13�ڸ��� ���ڸ� �Է� : ");
			String id = sc.nextLine();

			if (id.length() != 13) {
				System.out.println("�ٽ� �Է��ϼ��� : ");
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
				System.out.println("�ٽ� �Է����ּ���");
				continue;
			}
			
			switch (flag) {
			case 1:
			case 2:
				if (birthYear >= 1900 && birthYear <= 1999) {
					System.out.println("��Ȯ�� �Է��Դϴ�");
					break;
				}
				else if (birthYear >= 2000) {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է����ּ���");
					continue;
				}
			case 3:
			case 4:
				if (birthYear >= 2000 && birthYear <= 2999) {
					System.out.println("��Ȯ�� �Է��Դϴ�");
					break;
				}
				else if (birthYear < 2000) {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է����ּ���");
					continue;
				}
			}
			
			int age = now.getYear() - birthYear;
			if (birthMonth > now.getMonthValue() || birthMonth == now.getMonthValue() && birthMonth > now.getMonthValue()) age--;
			
			return age;
		}
	}
}
