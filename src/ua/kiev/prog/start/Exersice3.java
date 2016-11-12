package ua.kiev.prog.start;

public class Exersice3 {
    public static void main(String[] args) {

        int [] a = {5, 6, 6, 5};
        System.out.println(toString(a));
    }


    public static String toString(int[] arr){
        StringBuilder sb = new StringBuilder("{");
        for (int s : arr){
            sb.append(s);
            sb.append(" ");
        }
        return sb.append("}").toString();
    }
}
