package com.mariazlateva.basic.buublesort;

import com.mariazlateva.basic.Sorter;

class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int lastElement = array.length - 1; lastElement > 0; lastElement--) {
            for (int i = 0; i < lastElement; i++) {
                if (array[i] > array[i + 1]) {
                    this.swap(array, i, (i + 1));
                }
            }
        }
    }//end of method sort

    private void swap(int[] array, int elementOne, int elementTwo) {
        if (elementOne == elementTwo) {
            return;
        }
        int temp = array[elementOne];
        array[elementOne] = array[elementTwo];
        array[elementTwo] = temp;
    }//end of method swap

}//end of class BubbleSort
