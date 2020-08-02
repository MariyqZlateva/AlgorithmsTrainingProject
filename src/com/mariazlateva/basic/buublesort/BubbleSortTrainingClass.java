package com.mariazlateva.basic.buublesort;

import com.mariazlateva.basic.Sorter;

class BubbleSortTrainingClass implements Sorter {
    @Override
    public void sort(int[] array) {
        for (int lastElem = array.length - 1; lastElem > 0; lastElem--) {
            for (int i = 0; i < lastElem; i++) {
                this.swap(array, i, i + 1);
            }
        }
    }//end of sort method

    private void swap(int[] array, int elemOne, int elemTwo) {
        if (elemOne == elemTwo) {
            return;
        }
        int temp = array[elemOne];
        array[elemOne] = array[elemTwo];
        array[elemTwo] = temp;
    }//end of swap method

}//end of class BubbleSortTrainingClass
