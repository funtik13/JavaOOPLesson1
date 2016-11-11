package ua.kiev.prog.OOP;

import java.util.Scanner;

public class Triangle extends Figure{
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private boolean triangleInequalityIs = true;

    public Triangle(double a, double b, double c){
        sideOne = a;
        sideTwo = b;
        sideThree = c;
        do {
            if (sideOne < (sideTwo + sideThree) && sideTwo < (sideOne + sideThree)
                    && sideThree < (sideOne + sideTwo)) {
                triangleInequalityIs = false;
                System.out.println("Triangle created");
            }else{
                System.out.println("Unable to create a triangle with such sides.");
                System.out.println("Enter new sides.");
                setNewSides();
            }
        }while(triangleInequalityIs);

    }

    @Override
    public double getS() {
        double p = perimetr() / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    public double perimetr() {
        return (sideOne + sideTwo + sideThree);
    }

    private void setNewSides(){
        Scanner scan = new Scanner(System.in);
        setSideOne(scan.nextDouble());
        setSideTwo(scan.nextDouble());
        setSideThree(scan.nextDouble());
        scan.close();
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getSideTwo() {

        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

}
