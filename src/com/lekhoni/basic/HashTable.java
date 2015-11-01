package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class HashTable {
	/**
	 * 1. Insert, delete items (with key) and search item using key
	 * 2. Hashing with chaining 
	 */
	
	private int[] store;
	
	public int hash(int key){
		return key % store.length;
	}
	
	
}
