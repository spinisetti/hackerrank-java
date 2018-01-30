package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }

        Arrays.sort(arr, new StringNumber());

        for(String s: arr) {
            System.out.println(s);
        }
        System.out.println("");


        in.close();
    }
}

class StringNumber implements Comparator<String> {


    @Override
    public int compare(String a, String b) {

        if(a.length() < b.length()) {
            return -1;
        }
        else if (a.length() > b.length()) {
            return 1;
        }
        else {
            for(int i=0;i<a.length();i++) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(i);

                if (c1 < c2) {
                    return -1;
                }
                else if (c1 > c2) {
                    return 1;
                }
            }
            return 0;
        }
    }
}

