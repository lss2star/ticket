package LandTicket;

public class Output {
	static Input input = new Input();
	public void asktype() {
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		input.ticketType();
	}
	public static void askage() {
		System.out.println("13�ڸ� ���ڸ� �Է��ϼ��� :");
	}
	public void askPrefer() {
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		input.selectPersonType();
	}
	public void askEa() {
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		input.amountEa();
	}
	public void totalPrice() {
		System.out.println("�� %d�� �Դϴ�");      //  total���� Ȯ���ؼ� �־������
		System.out.println("�����մϴ�");
	}
	public void continueOreder () {
		System.out.println("��� �߱��Ͻðڽ��ϴ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		input.order();
	}

}
