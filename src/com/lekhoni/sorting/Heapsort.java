package com.lekhoni.sorting;

import com.lekhoni.common.Helper;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */
public class Heapsort implements Sort {
    @Override
    public void sort(int[] items) {
        heapSort(items);
    }

    /**
     * Create a heap from given n items
     * The heap is stored in reverse order- root at the end of array
     * Complexity = O(n)
     * @param items
     */
    private void bottomUpHeap(int[] items){
        for(int i=0;i<items.length;i++){
            int pos = i;
            while(pos*2<items.length && items[pos]<items[pos*2]){

                if(items[pos]<items[pos*2]) {
                    Helper.swap(items, pos, pos*2);
                    pos = pos * 2;
                }

            }
        }
    }

    private void heapSort(int[] items) {
        bottomUpHeap(items);

        for(int i=0;i<items.length;i++){
            items[i] = removeMin(items, i);
        }

    }

    private int removeMin(int[] items, int storeAt) {
        int item = items[items.length];
        items[storeAt] = items[items.length-1];
        int pos = items.length - 1;
        while(pos>storeAt && items[pos]>items[pos/2]){

        }
        return item;
    }
}
