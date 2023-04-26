package LandTicket;

public class ageCal {
	public int getAge() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seperateId = new ArrayList<>();
		while (true) {
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
		
		
		
		}
}
