package com.lekhoni.sorting;

/**
 * Created by kuasha on 1/19/15.
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] items) {
        mergeSort(items, 0, items.length-1);
    }

    private void mergeSort(int[] items, int left, int right) {

    }
}
