package com.mariazlateva.basic.insertionsort;

import com.mariazlateva.basic.Sorter;

public class InsertionSort implements Sorter {

    // == public methods ==

    @Override
    public void sort(int[] array) {
        for (int right = 1; right < array.length; right++) {
            int candidate = array[right];
            int left;
            for (left = right; left > 0 && candidate < array[left - 1]; left--) {
                array[left] = array[left - 1];
            }
            array[left] = candidate;
        }
    }//end of method sort

}//end of class InsertionSort
