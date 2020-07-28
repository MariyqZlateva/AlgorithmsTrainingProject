package com.mariazlateva.basic.buublesort;

import com.mariazlateva.basic.Sorter;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] array = new int[]{7, 1, -15, 35, 55, -22};
        Sorter bubbleSort = new BubbleSort();
        sortAndPrint(array, bubbleSort);
    }//end of main method

    private static void sortAndPrint(int[] array, Sorter sorter) {
        sorter.sort(array);
        System.out.println(Arrays.toString(array));

    }

}//end of class Main
