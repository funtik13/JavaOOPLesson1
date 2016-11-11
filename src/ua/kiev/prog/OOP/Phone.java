package ua.kiev.prog.OOP;

public abstract class Phone {
    private static Phone[] phoneStore = new Phone[100];
    static int p = 0;
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
    protected int countSMS;
    protected String number;

    public static void add(Phone s) {
        phoneStore[p++] = s;
    }

	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
        phoneStore[find(number)].answer();
	}

    public int find(String number) {
        for (int i = 0; i < p; i++) {
            if (phoneStore[i].getNumber() == number)
                return i;
        }
        return -1;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract void sendSMS(String number, String message);

    public abstract void answer();
}
