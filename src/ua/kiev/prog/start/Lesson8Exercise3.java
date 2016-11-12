package ua.kiev.prog.start;

public class Lesson8Exercise3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 1, 3, 3, 3};
        int[] arr2 = {3, 4, 4, 7, 3};
        int[] arr3 = {3, 1, 4, 7, 2, 8, 4, 3, 1, 4, 3, 4};
        int sumOfArr = 0;
        int allArrLenght = arr1.length + arr2.length + arr3.length;

        for (int i = 0; i < allArrLenght; i++){
            if (i < arr1.length){
                sumOfArr += arr1[i];
            }
            else if (i >= arr1.length && i < (arr1.length + arr2.length)){
                sumOfArr += arr2[i - arr1.length];
            }
            else {
                sumOfArr += arr3[i - (arr1.length + arr2.length)];
            }
        }

        System.out.println(sumOfArr);
    }
}
