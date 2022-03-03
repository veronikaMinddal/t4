package com.company;

public class Main {

    public static void main(String[] args) {
        //1.a
        int[] arr = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
        printArr(arr);
        sortedArr(arr);
        System.out.println();
        printArr(arr);


    }

    //1.b
    //1.c
    //1.d
    public static int[] sortedArr(int[] arrI) {
        for (int i = 0; i < arrI.length-1; i++) {
            for (int k = i + 1; k < arrI.length; k++) {
                if (arrI[i] > arrI[k]) {
                    int temp1 = arrI[i];
                    int temp2 = arrI[k];
                    arrI[i] = temp2;
                    arrI[k] = temp1;
                }
            }
        }
        return arrI;
    }

    public static void printArr(int[] arrJ) {
        for (int i = -0; i < arrJ.length; i++) {
            System.out.print(arrJ[i] + " ");
        }
    }
}
