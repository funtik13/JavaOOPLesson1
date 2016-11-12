package ua.kiev.prog.polimorphysm;


public class DrawRecatngle {
    public static void main(String argsp[]) {

        drawRectangle(5, 70);

    }

    public static void drawRectangle(int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == (height - 1)) {
                    System.out.print("*");
                } else if (j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
