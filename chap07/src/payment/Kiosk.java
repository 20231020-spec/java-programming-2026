package payment;

public class Kiosk {

	public static void main(String[] args) {
		
		Payment payment = new CachPayment();
		
		payment.pay();

	}

}
