package com.lekhoni.sorting;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */

/**
 * Put all items in the unsorted list I
 * Create an empty sorted list S = {}
 * While there is any more items left in I
 *  Remove an item X from I
 *      Insert X  into S at right place
 * Return S
 */
public class InsertionSort implements Sort {
    @Override
    public void sort(int[] items) {
        int length = items.length;
        for(int i=0;i<length;i++){
            int item = items[i];
            int pos = i;

            // Move numbers from the sorted part to on step right as long as
            // it is bigger than current item creating a hole where it was.
            for(int si=i;si>0;si--){
                if(item < items[si-1]){
                    //move the number to right moving the hole left
                    items[si] = items[si-1];
                    pos = si-1;
                }
                else{
                    break;
                }
            }
            // Put the current number at the hole
            items[pos] = item;
        }
    }
}
