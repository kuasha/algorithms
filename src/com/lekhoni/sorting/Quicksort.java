package com.lekhoni.sorting;

import com.lekhoni.common.Helper;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */
public class Quicksort implements Sort {
    @Override
    public void sort(int[] items) {
        quicksort(items, 0, items.length-1);
    }

    /**
     partition(items, left, right)
        X = items[left]
        I = left
        FOR J = left+1 TO right
            IF items[J] <= X
                I = I + 1
                swap(items[I], items[J])

        swap(items[left], items[I])
     Return I
     */
    private int partition(int[] items, int left, int right) {
        int x = items[left];
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (items[j] <= x) {
                i = i + 1;
                Helper.swap(items, i, j);
            }
        }
        Helper.swap(items, left, i);
        return i;
    }

    /*
    quicksort(items, left, right)
        if left < right
            r = partition(items, left, right)
            quicksort(items, left, r-1)
            quicksort(items, r+1, right)

    */
    private void quicksort(int[] items, int left, int right){
        if(left<right){
            int r = partition(items, left, right);
            quicksort(items, left, r - 1);
            quicksort(items, r+1, right);
        }
    }

    /*
    quickselect(items, left, right, k)
        if(left == right)
            return items[left]

        r = partition(items, left right)

        if r == k
            return items[k]
        if r > k
            return quickselect(items, left, r-1)
        else
            return quickselect(items, r+1, right, k)
    */

    public int quickSelect(int[] items, int left, int right, int k){
        if(left == right){
            return items[left];
        }

        int r = partition(items, left, right);

        if(r == k){
            return items[k];
        }

        if(r > k){
            return quickSelect(items, left, r-1, k);
        }
        else{
            return quickSelect(items, r+1, right, k);
        }
    }

    /*
    public void test(){
        int[] items = new int[]{64, 43, 24, 78, 65, 35, 98, 12, 45, 65, 28, 67, 54, 10};
        Quicksort sort = new Quicksort();
        sort.sort(items);
        for(int item: items) {
            System.out.println(item);
        }

        System.out.println(sort.quickSelect(items, 0, items.length-1, 5));
    }
    */
}
