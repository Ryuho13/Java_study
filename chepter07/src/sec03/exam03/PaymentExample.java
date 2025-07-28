package sec03.exam03;

public class PaymentExample {
	public static void main(String[] args) {
//		//카드 결제
//		Cardpayment cardpayment = new Cardpayment();
//		cardpayment.pay(50000);
//		//Paypal 결제
//		PaypalPayment paypalPayment = new PaypalPayment();
//		paypalPayment.pay(30000);
//		// 계좌이체
//		BankTransferPayment bankTransferPayment = new BankTransferPayment();
//		bankTransferPayment.pay(20000);
		// 다형성 사용
		PaymentService payment;
		
		payment = new Cardpayment();
	    payment.pay(50000);
	    payment = new PaypalPayment();
	    payment.pay(30000);
	    payment = new BankTransferPayment();
	    payment.pay(20000);
	}


}
