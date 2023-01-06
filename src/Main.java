import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input[] = {1, 5, 2, 44, 3, 2};
        printSortedNum(input);

    }
    static private void printSortedNum(int[] input){
        System.out.print("input: ");
        for (int i = 0; i <input.length; i++){
            System.out.print(input[i]+",");
        }
        sort(input);
        System.out.print("\noutput: ");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i]+",");
        }
    }

    static private void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}