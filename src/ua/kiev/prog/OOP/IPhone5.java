package ua.kiev.prog.OOP;

public class IPhone5 extends IPhone {
	
	public IPhone5(String number) {
		System.out.println("IPhone5 constructor");

		screenSize = 4;
        countSMS = 0;
        countCall = 0;
        this.number = number;
	}


    @Override
    public void answer() {
        System.out.println("Iphone5 with number -->" + this.number + " is answer.");
    }

	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);
        this.countSMS++;
	}
}
