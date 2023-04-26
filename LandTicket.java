package LandTicket;

public class LandTicket {

	public static void main(String[] args) {
		Input input = new Input();
		Output output = new Output();
		do {
			output.asktype();
		
			
			output.askPrefer();
			output.askEa();
			output.totalPrice();
			output.continueOreder();
		} while (input.getOrder() == 2);

	}

}
