/**
Ques...----->> 9
Palindrome Number
Easy

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

Example 1:

Input: x = 121
Output: true


**/



class Solution {
    public boolean isPalindrome(int x) {
        
         if (x < 0) return false;

        int reverse = 0, copy = x;

        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }

        return reverse == x;
        
    }
}
