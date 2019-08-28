package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String line;
        int[] arr;
        line = sc.nextLine();
        while (true) {
            arr = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            lotto(arr, 1, "",0);
            System.out.println("");

            line = sc.nextLine();
            if(line.equals("0")) return;
        }
    }

    public static void lotto(int[] arr, int i, String str, int count) {
        if(count == 6) {
            System.out.println(str.trim());
            return;
        }
        if(i >= arr.length) return;
        lotto(arr, i + 1, str+ " " +arr[i], count +1);
        lotto(arr, i + 1, str, count);
    }

}
