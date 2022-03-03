package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	allDeviVal(5);
    allDeviVal(7);
    //4.b
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    randArr(arr);

    }
    //4.a
    public static void allDeviVal (int devi){
        for (int i=0; i <= 100;i++){
            if (i % devi == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static int randArr(int[] someArr){

    }


}
