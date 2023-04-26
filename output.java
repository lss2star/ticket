package LandTicket;

public class Output {
	static Input input = new Input();
	public void asktype() {
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		input.ticketType();
	}
	public static void askage() {
		System.out.println("13자리 숫자를 입력하세요 :");
	}
	public void askPrefer() {
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		input.selectPersonType();
	}
	public void askEa() {
		System.out.println("몇 개를 주문하시겠습니까? (최대 10개)");
		input.amountEa();
	}
	public void totalPrice() {
		System.out.println("총 %d원 입니다");      //  total가격 확인해서 넣어줘야함
		System.out.println("감사합니다");
	}
	public void continueOreder () {
		System.out.println("계속 발권하시겠습니다?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		input.order();
	}

}
