package ua.kiev.prog;

import java.util.Scanner;


public class Exercise6 {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        decToBin(a);
        System.out.println("Number of units --> " + count());
        scan.close();


    }
    // Перевести десятичное число в двоичное
    public static void decToBin (int a){
        sb = new StringBuilder("");

        for (;a != 0;){
            if (a % 2 == 0)
            {
                sb.append("0");
            }
            else{
                sb.append("1");
            }
            a /= 2;
        }
        sb.reverse();
    }
    // Подсчёт едениц
    public static int count(){
        int counter = 0;
            for(char elem: sb.toString().toCharArray()){
                if (elem == '1') counter++;
            }
        return counter;
    }
}
