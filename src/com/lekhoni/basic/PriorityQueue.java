package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class PriorityQueue {
	
	private int[] store;
	private int itemCount;
    
    public PriorityQueue(int[] data, int itemCount){
        store = data;
        this.itemCount = itemCount;
    }
    
    public void printAll(){
    	for(int i=0;i<itemCount;i++){
    		System.out.print(store[i] + " ");
    	}
    }
    
    public static void swap(int[] numbers, int i, int j){
        //System.out.println("swap " + i + ", " + j + " - " + numbers[i] + " " + numbers[j]);
                        
        int temp = numbers[i];
        numbers[i]=numbers[j];
        numbers[j] = temp;
    }
    
    /**
     * Bottom up heap construction is a linear time O(N) algorithm
     */
    public static void bottomUpHeap(int[] numbers, int itemCount){
        
        for(int i = itemCount - 1;i>=1;i--){
            //System.out.println("Working with " + i);
            
            int curIndex = i;
            while(curIndex < itemCount){
                int child1Index = curIndex * 2;
                int child2Index = child1Index + 1;

                if(child1Index < itemCount && child2Index < itemCount && 
                		(numbers[curIndex] > numbers[child1Index] || numbers[curIndex] > numbers[child2Index])){                	
                    //System.out.println(child1Index + " " + child2Index);
                    
                    if(numbers[child1Index] > numbers[child2Index]){
                        swap(numbers, curIndex, child2Index);
                        curIndex = child2Index;
                    }
                    else{
                        swap(numbers,curIndex,  child1Index);
                        curIndex = child1Index;
                    }
                }
                else if(child1Index < itemCount && numbers[curIndex] > numbers[child1Index]){	
                		swap(numbers, curIndex, child1Index);                    
                		curIndex = child1Index;
                	
                }
                else if(child2Index < itemCount && numbers[curIndex] > numbers[child2Index]){
                		swap(numbers, curIndex, child2Index);
                		curIndex = child2Index;
                	
                }
                else{
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args){        
        int[] numbers = new int[] {0,15,8,3,7,12,4,18,3,2};        
       
        int[] queue = new int[100];
        
        for(int i=0;i<numbers.length;i++){
        	queue[i] = numbers[i];            
        }
        
        PriorityQueue.bottomUpHeap(queue, numbers.length);
        
        PriorityQueue pq = new PriorityQueue(queue, numbers.length);
        pq.printAll();
    }
}