package ua.kiev.prog.OOP;

public class IPhone extends Phone {

    public IPhone() {
        System.out.println("IPhone constructor");

        touch = true;
        hasWifi = true;
        screenSize = 3;
        countSMS = 0;
        countCall = 0;
    }
	public IPhone(String number) {
		System.out.println("IPhone constructor");
		
		touch = true;
		hasWifi = true;
		screenSize = 3;
		countSMS = 0;
		countCall = 0;
        this.number = number;
	}

    @Override
    public void answer() {
        System.out.println("Iphone with number -->" + this.number + " is answer.");
    }
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);
        this.countSMS++;
	}
}
