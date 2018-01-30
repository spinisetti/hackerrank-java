package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//
//        String arry = in.nextLine();
//
//        int[] vals = Arrays.stream(arry.split(" ")).mapToInt(Integer::parseInt).toArray();
//        insertionSort2(n,vals);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();

    }

    static void insertionSort2(int n, int[] vals) {
        // Complete this function
        for(int i=1;i<vals.length;i++) {
            for(int j=i;j>0;j--) {
                if(vals[j] < vals[j-1]) {
                    int tmp = vals[j-1];
                    vals[j-1] = vals[j];
                    vals[j] = tmp;
                }
            }
            printArray(vals);
        }
    }

    private static void printArray(int[] arry) {
        Arrays.stream(arry).forEach(v -> System.out.format("%d ", v));
        System.out.println("");

    }
}
