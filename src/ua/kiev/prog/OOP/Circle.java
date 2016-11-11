package ua.kiev.prog.OOP;

import java.util.Scanner;

public class Circle extends Figure{

    private int x;
    private int y;
    private double radius;

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        do {
            if (radius < 0) {
                System.out.println("Radius is less then 0");
                System.out.println("Enter new radius");
                setNewRadius();
            }else{
                this.radius = radius;
            }
        }while(this.radius < 0);
    }

    @Override
    public double getS() {
        return Math.PI * Math.pow(radius, 2);
    }

    private void setNewRadius(){
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
            do {
                if (radius < 0) {
                    System.out.println("Radius is less then 0");
                    System.out.println("Enter new radius");
                    setNewRadius();
                }else{
                    this.radius = radius;
                }
            }while(this.radius < 0);
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
