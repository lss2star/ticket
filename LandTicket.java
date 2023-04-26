package LandTicket;

public class LandTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	public  int select_Ticket(int n) { // n = ticket_type
		do {
			System.out.println("권종을 선택하세요");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
		} while ((n <= 0) || (n > 2));
		return n;
	}

	public void calage() {

	}

	public int calculate_time_price(int n, int age) { // n = ticket_type, age = age
		switch (n) {
		case 1:
			if (age <= 2) {
				return ConstValue.infant_dayTime_price;
			} else if (age <= 12) {
				return ConstValue.child_dayTime_price;
			} else if (age <= 18) {
				return ConstValue.juv_dayTime_price;
			} else if (age <= 64) {
				return ConstValue.adult_dayTime_price;
			} else {
				return ConstValue.senior_dayTime_price;
			}
		case 2:
			if (age <= 2) {
				return ConstValue.infant_nightTime_price;
			} else if (age <= 12) {
				return ConstValue.child_nightTime_price;
			} else if (age <= 18) {
				return ConstValue.juv_nightTime_price;
			} else if (age <= 64) {
				return ConstValue.adult_nightTime_price;
			} else {
				return ConstValue.senior_nightTime_price;
			}
		default:
			return 0;
			
		}
		
	}

}
