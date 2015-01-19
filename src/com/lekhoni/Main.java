package com.lekhoni;

import com.lekhoni.sorting.*;

/**
 * Created by kuasha on 1/19/15.
 */
public class Main {
    public static void main(String[] args){
        int[] items = new int[]{64, 43, 24, 78, 65, 35, 98, 12, 45, 65, 28, 67, 54, 10};
        Sort sort = new Heapsort();
        sort.sort(items);
        for(int item: items) {
            System.out.println(item);
        }
    }
}
