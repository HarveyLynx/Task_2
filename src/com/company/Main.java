package com.company;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    private static List<Integer> list1 = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int avg = 0;
        System.out.println("введите размер массива");
        int k = in.nextInt();
        int[] arr = new int[k];
        String mx = "", mn = "";
        System.out.println("введите масив(каждое следующее число через enter)");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            avg = avg + String.valueOf(arr[i]).length();
            for (int j = 0; j < String.valueOf(arr[i]).length(); j++) {
                if (i == 0) {
                    mn = String.valueOf(arr[i]);
                } else {
                    if (mn.length() < String.valueOf(arr[i]).length()) {
                        mn = String.valueOf(arr[i]);
                    } else {
                        mn = mn;
                    }
                }
                if (i == 0) {
                    mx = String.valueOf(arr[i]);
                } else {
                    if (mx.length() > String.valueOf(arr[i]).length()) {
                        mx = String.valueOf(arr[i]);
                    } else {
                        mx = mx;
                    }
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(arr[i]).length() > (avg / k)) {
                System.out.println("Average: " + String.valueOf(arr[i]));
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (String.valueOf(arr[j]).length() > String.valueOf(arr[j + 1]).length()) {
                    String tmp = String.valueOf(arr[j]);
                    arr[j] = arr[j + 1];
                    arr[j + 1] = Integer.parseInt(tmp);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("MAX: " + mn + ";Length: " + mn.length());
        System.out.println("MIN: " + mx + ";Length: " + mx.length());

    }

}
