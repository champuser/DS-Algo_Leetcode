/**
Ques...----->   35
Search Insert Position
Easy

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1




**/




class Solution {
    public int searchInsert(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == target)
//                 return i;
// }
//         for(int i=0;i<nums.length;i++){
//             while(target)
                
            
// }
        
//         return -1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>= target) // simply checking the target value bcs given that nums values sorted in ascending order
                return i;
}
        return nums.length;
        
    }
    
   
}
