package com.mariazlateva.basic.selectionsort;

import com.mariazlateva.basic.Sorter;

public class SelectionSortTrainingClass implements Sorter {
    //== public methods ==

    @Override
    public void sort(int[] array) {

    }//end of method sort

    //==private methods==
    private void swap(int[] array, int elementOne, int elementTwo) {
        int temp = array[elementOne];
        array[elementOne] = array[elementTwo];
        array[elementTwo] = temp;
    }//end of method swap

}//end of class SelectionSortTrainingClass
