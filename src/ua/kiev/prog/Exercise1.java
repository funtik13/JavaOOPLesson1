package ua.kiev.prog;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise1 {
    public static Calendar currentDate = Calendar.getInstance();
    public static Calendar newdate = Calendar.getInstance();

    public static void main(String[] args){
        newDate();
        compareOfDate();
    }

    // Ввод даты с клавиатуры
    public static void newDate(){
        int year ;
        int month ;
        int day ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a date.");
        System.out.print("Enter year -->");
        year = scan.nextInt();
        System.out.print("Enter month -->");
        month = scan.nextInt();
        System.out.print("Enter day -->");
        day = scan.nextInt();
        newdate.set(year, month, day);
    }

    //Сравнение дат
    public static void compareOfDate(){
        int[] a = differenceInDate();
        if (a[0] == 0 && a[1] == 0 && a[2] == 0){
            System.out.println("Date is equals.");
        }
        else if (currentDate.after(newdate))
        {
            System.out.print("Difference in year -->");
            System.out.println(a[0]);
            System.out.print("Difference in month -->");
            System.out.println(a[1]);
            System.out.print("Difference in day -->");
            System.out.println(a[2]);
        }
        else {
            System.out.print("Difference in year -->");
            System.out.println(Math.abs(a[0]));
            System.out.print("Difference in month -->");
            System.out.println(Math.abs(a[1]));
            System.out.print("Difference in day -->");
            System.out.println(Math.abs(a[2]));
        }
    }

    //Вычесление разницы дат и запись их в масив
    public static int[] differenceInDate(){
        int[] massDate = new int[3];
        massDate[0] = currentDate.get(Calendar.YEAR) - newdate.get(Calendar.YEAR);
        massDate[1] = (currentDate.get(Calendar.MONTH) - newdate.get(Calendar.MONTH) + 1 );
        massDate[2] = currentDate.get(Calendar.DAY_OF_MONTH) - newdate.get(Calendar.DAY_OF_MONTH);
        return massDate;
    }

}
