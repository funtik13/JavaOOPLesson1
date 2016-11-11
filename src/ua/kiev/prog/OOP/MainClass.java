package ua.kiev.prog.OOP;

public class MainClass {

	public static void main(String[] args) {
		
		Phone nokia = new Nokia3310("123");
        Phone nokia1 = new Nokia3310("124");
        Phone nokia2 = new Nokia3310("125");
        Phone nokia3 = new Nokia3310("126");


        Phone samsung = new SamsungS4("222");
        Phone samsung1 = new SamsungS4("333");
        Phone samsung2 = new SamsungS4("444");
        Phone samsung3 = new SamsungS4("555");

        Phone.add(nokia);
        Phone.add(nokia1);
        Phone.add(nokia2);
        Phone.add(nokia3);
        Phone.add(samsung);
        Phone.add(samsung1);
        Phone.add(samsung2);
        Phone.add(samsung3);

        samsung.call("123");
        System.out.println(samsung.countCall);
        System.out.println(samsung1.countCall);


    }
}
