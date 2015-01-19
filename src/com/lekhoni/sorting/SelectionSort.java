package com.lekhoni.sorting;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */

/**
 * Put all items in the unsorted list I
 * Create an empty sorted list S = {}
 * While there is any more items left in I
 *  Find X where X is the smallest item in I
 *      Remove X from I and insert at the end of S
 * Return S
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] items) {
        int length = items.length;

        //Every item with less than pos index is sorted already
        for(int pos=0;pos<length;pos++) {
            int minPos = pos;
            //Find the smallest index from remaining unsorted items (index pos to end)
            for (int i = pos + 1; i < length; i++) {
                if (items[i] < items[minPos]) {
                    minPos = i;
                }
            }

            //swap the item at the end of sorted list S (index pos) with smallest item in I
            int temp = items[pos];
            items[pos] = items[minPos];
            items[minPos] = temp;
        }
    }
}
