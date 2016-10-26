package ua.kiev.prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    static String str;
    static String[] strArr;
    static  int[] numberArr;
    static int rez = 0;
    static boolean input = true;

    public static void main(String[] args) {
        inputNumber();
        binTODec();
        System.out.println(str + " in the decimal system --> " + rez);
    }

    //���� �����
    public static void inputNumber(){
        BufferedReader bf = null;
        do {
            bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number in the binary system.");
            try {
                str = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            strToInt();
        }
        while (input);
        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // �������������� ������� ������ � ����� int � �������� ������������ �����
    public static void strToInt(){
        strArr = str.split("");
        numberArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
                numberArr[i] = Integer.parseInt(strArr[i]);
            if (numberArr[i] > 1 || numberArr[i] < 0)
            {
                System.out.println("Wrong binnary code. Try once more.");
                return;
            }
        }
        input = false;
    }

    // �������������� ������ 1 � 0 � ������������ �����
    public static void binTODec(){
        for (int i = 0; i < numberArr.length; i++){
            if (numberArr[i] == 1){
                rez = (rez * 2) + 1;
            }
            else{
                rez *= 2;
            }
        }
    }
}
