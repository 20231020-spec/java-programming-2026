package payment;

public class CachPayment extends Payment{

	@Override
	public void pay() {
		System.out.println("현금으로 지불합니다.");
		
	}

}
