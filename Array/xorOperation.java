/**
Ques..----> 1486
XOR Operation in an Array
Easy

Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.

 

Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.


**/


class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        n = nums.length;
        for(int i=0;i<nums.length;i++){
            nums[i] = start + 2*i;
}
        
        int result =0;
        for(int item: nums){
        result = result^item;
        }
        return result;
        
    // there is no need of array
//         int xor=0;
//         for(int i=0;i<n;i++){
//             xor = xor ^ start + 2*i;
//         }
//         return xor;
        
    }
}
