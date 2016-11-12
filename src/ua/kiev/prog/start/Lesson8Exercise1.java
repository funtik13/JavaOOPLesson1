package ua.kiev.prog.start;

public class Lesson8Exercise1 {
    public static void main(String[] args) {
        String str = "word1 word2 word3";
        String[] arrStr = str.split(" ");
        String[] afterSwap = swap(arrStr, 0, 2);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(afterSwap[i] + " ");
        }
    }

    public static String[] swap(String[] arr, int a, int b){
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }
}
