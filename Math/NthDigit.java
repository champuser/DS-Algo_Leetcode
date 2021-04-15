/*
// Adobe -------> Leetcode Ques. 400
Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].

 

Example 1:

Input: n = 3
Output: 3

Example 2:

Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.


*/


class Solution {
    public int findNthDigit(int n) {
        long digits = 9;
        int length =1;
        int first =1;
        while(n > length * digits){
            n -= length * digits;
            length++;
            first *= 10;
            digits *=10;
            
        }
         
        first += (n-1)/length;
        String digitString = Integer.toString(first);
        return Character.getNumericValue(digitString.charAt((n-1) % length));
        
    }
}
