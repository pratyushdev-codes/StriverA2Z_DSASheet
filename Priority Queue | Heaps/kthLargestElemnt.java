// 215. Kth Largest Element in an Array
// Solved
// Medium
// Topics
// Companies
// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

public class kthLargestElemnt(int [] nums , int k ){
  
    PriorityQueue<Intger> pq = new PriorityQueue<>();
    
    for(int i =0 ; i <k; i++){
      pq.add(nums[i]);
      
  }for(int i = k ; i< nums.length; i++){
    if(nums[i]>pq.peek()){
      pq.remove();
      pq.add(nums[i]);
  }
  }
    
    
    return pq.peek();
    
    
    
  }
