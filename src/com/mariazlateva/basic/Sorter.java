package com.mariazlateva.basic;

public interface Sorter {

    void sort(int[] array);

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }//end of static method swap

}// end of interface Sorter
