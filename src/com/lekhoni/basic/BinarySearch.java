package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class BinarySearch {
    
    public int search(int[] numbers, int key){
        int start = 0, end = numbers.length;
        
        while(start<=end){
            int mid = start + (end-start)/2;

            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args){
        BinarySearch bsearch = new BinarySearch();
        int[] numbers = {1,5,13,18,34,52,62,74,89};
        int found = bsearch.search(numbers, 62);
        System.out.println(found);
    }
}
