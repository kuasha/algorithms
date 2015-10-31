package com.lekhoni.basic;

/**
 * Created by kuasha on 1/19/15.
 */
public class PriorityQueue {
    
    public PriorityQueue(){
        
    }
    
    
    public void swap(int[] numbers, int i, int j){
        System.out.println("swap " + i + ", " + j + " - " + numbers[i] + " " + numbers[j]);
                        
        int temp = numbers[i];
        numbers[i]=numbers[j];
        numbers[j] = temp;
    }
    
    /**
     * Bottom up heap construction is a linear time O(N) algorithm
     */
    public void constructQueue(int[] numbers, int itemCount){
        System.out.println(itemCount);
        
        for(int i = itemCount - 1;i>=1;i--){
            System.out.println("Working with " + i);
            
            int curIndex = i;
            while(curIndex < itemCount){
                int child1Index = curIndex * 2;
                int child2Index = child1Index + 1;

                if(child1Index < itemCount && child2Index < itemCount ){                	
                    System.out.println(child1Index + " " + child2Index);
                    
                    if(numbers[child1Index] > numbers[child2Index]){
                        //swap
                        swap(numbers, child2Index, curIndex);
                        curIndex = child2Index;
                    }
                    else{
                        //swap
                        swap(numbers, child1Index, curIndex);
                        curIndex = child1Index;
                    }
                }
                else if(child1Index < itemCount){
                    //swap
                    swap(numbers, child1Index, curIndex);                    
                    curIndex = child1Index;
                }
                else if(child2Index < itemCount){
                    //swap
                    swap(numbers, child2Index, curIndex);
                    curIndex = child2Index;
                }
                else{
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        int[] numbers = new int[] {0,15,8,3,7,12,4,18,3,2};
        pq.constructQueue(numbers, numbers.length);
        
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
            
        }
    }
}