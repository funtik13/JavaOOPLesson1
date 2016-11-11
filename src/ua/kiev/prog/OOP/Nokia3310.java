package ua.kiev.prog.OOP;

public class Nokia3310 extends Phone {
	
	public Nokia3310(String number) {
		System.out.println("Nokia3310 constructor");
		
		touch = false;
		hasWifi = false;
		screenSize = 2;
		countSMS = 0;
		countCall = 0;
		this.number = number;
	}
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
		this.countSMS++;
	}

    @Override
    public void answer() {
        System.out.println("Nokia3310 with number -->" + this.number + " is answer.");
    }
}
