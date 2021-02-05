/**
Ques:----->136
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

 

Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4



**/

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        for(int i:set){
            
            return i;
        }
        return -1;
    }
}
