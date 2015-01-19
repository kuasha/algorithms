package com.lekhoni.common;

/**
 * Created by kuasha on 1/19/15.
 */
public class Helper {
    public static void swap(int[] items, int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
