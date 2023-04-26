package LandTicket;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);
	private static int ticketType;
	private static int selectPersonType;
	private static int amountEa;
	private static int continueOrder;
	
	public static void ticketType() {
		ticketType = sc.nextInt();
	}
	public int getTicketType () {
		return ticketType;
	}
	public void selectPersonType() {
		selectPersonType = sc.nextInt();
	}
	public int getSelectPersonType() {
		return selectPersonType;
	}
	public void amountEa() {
		amountEa = sc.nextInt();
	}
	public int getAmountEa() {
		return amountEa;
	}
	public void order() {
		continueOrder = sc.nextInt();
	}
	public int getOrder() {
		return continueOrder;
	}
	
	
}
