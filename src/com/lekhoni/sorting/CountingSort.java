package com.lekhoni.sorting;

import java.util.Dictionary;

/**
 * Created by kuasha on 1/19/15.
 */
public class CountingSort implements Sort {
    int low;
    int high;

    public CountingSort(int low, int high){
        this.low = low;
        this.high = high;
    }

    @Override
    public void sort(int[] items) {
        countingSort(items);
    }

    private void countingSort(int[] items) {
        int[] counts = new int[high-low+1];
        for(int i=0;i<items.length;i++){
            counts[items[i]-low]++;
        }

        int pos = 0;
        for(int c=0;c<counts.length;c++){
            while(counts[c]>0){
                items[pos] = c;
                pos++;
                counts[c]--;
            }
        }
    }
}
