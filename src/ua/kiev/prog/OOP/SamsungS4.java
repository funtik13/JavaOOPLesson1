package ua.kiev.prog.OOP;


public class SamsungS4 extends Phone {

    public SamsungS4(String number){
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
        countSMS = 0;
        countCall = 0;
        this.number = number;
    }


    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Hello " + message );
        this.countSMS++;
    }

    @Override
    public void answer() {
        System.out.println("SamsungS4 with number -->" + this.number + " is answer.");
    }
}
