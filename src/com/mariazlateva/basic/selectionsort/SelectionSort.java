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
           Sorter.swap(array, last, indexHoldingMaxValue);
        }
    }//end of method sort

}//end of class SelectionSort
