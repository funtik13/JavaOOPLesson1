package ua.kiev.prog.OOP;

import java.util.Scanner;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle (double h, double w){
        height = h;
        width = w;
        do {
            if (height >= 0 && width >= 0){
                System.out.println("Rectangle created");
            }else {
                System.out.println("Height or width cant be less than 0.");
                System.out.println("Enter new height and width");
                setNewSides();
            }
        }while (height < 0 || width < 0);
    }

    @Override
    public double getS() {
        return height * width;
    }

    private void setNewSides(){
        Scanner scan = new Scanner(System.in);
        setHeight(scan.nextDouble());
        setWidth(scan.nextDouble());
        scan.close();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
