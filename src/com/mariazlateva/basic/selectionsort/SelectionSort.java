package com.mariazlateva.basic.selectionsort;

import com.mariazlateva.basic.Sorter;

public class SelectionSort implements Sorter {
    // == public methods ==
    @Override
    public void sort(int[] array) {
        for (int last = array.length - 1; last > 0; last--) {
            int indexHoldingMaxValue = last;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[indexHoldingMaxValue]) {
                    indexHoldingMaxValue = i;
                }
            }
            this.swap(array, last, indexHoldingMaxValue);
        }
    }//end of method sort

    // == private methods ==
    private void swap(int[] array, int elementOne, int elementTwo) {
        int temp = array[elementOne];
        array[elementOne] = array[elementTwo];
        array[elementTwo] = temp;
    }//end of method swap

}//end of class SelectionSort
