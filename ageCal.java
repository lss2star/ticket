package LandTicket;

public class ageCal {
	public int getAge() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seperateId = new ArrayList<>();
		while (true) {
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
		
		
		
		}
}
