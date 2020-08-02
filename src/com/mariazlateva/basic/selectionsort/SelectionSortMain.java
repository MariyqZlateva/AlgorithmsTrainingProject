package com.mariazlateva.basic.selectionsort;

import com.mariazlateva.basic.Sorter;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] array = new int[]{7, 1, -15, 35, 55, -22};
        Sorter selectionSort = new SelectionSortTrainingClass();
        sortAndPrint(array, selectionSort);

    }//end of  main method

    private static void sortAndPrint(int[] array, Sorter sorter) {
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }//end of method sortAndPrint

}//end of class SelectionSortMain

