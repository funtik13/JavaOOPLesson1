package ua.kiev.prog;

public class Exersice2 {

public static void main(String[] args) {
    short a[] = {1, 2, 3, 4};
    short b[] = {1, 2, 3, 4};
    short c[] = {1, 2, 3};
    short d[] = {1, 2, 3, 5};

    System.out.println(equals(a, b));
    System.out.println(equals(a, c));
    System.out.println(equals(a, d));
}



    // Переопределение метода equals для short[]
    public static boolean equals(short[] a, short[] b) {
        boolean rez = true;
        if(a.length != b.length){
            rez = false;
        }
        else{
            for (int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    rez = false;
                    break;
                }
            }
        }
        return  rez;

    }
}
