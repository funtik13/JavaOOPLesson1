package ua.kiev.prog.start;

public class Lesson8Exercise2 {
    public static void main(String[] args) {
        String str = "I love Java and Java loves me.";
        String[] strArr = str.split(" ");
        System.out.println("Number of Matches words --> " + countMatchWord(strArr, "Java"));
    }

    public static int countMatchWord(String[] arr, String word){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(word)){
                count++;
            }
        }
        return count;
    }
}
