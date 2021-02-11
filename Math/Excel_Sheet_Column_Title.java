/**
Ques.--->168
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...

Example 1:

Input: 1
Output: "A"

Example 2:

Input: 28
Output: "AB"

**/

class Solution {
    public String convertToTitle(int n) {
        // problem is like
        // convert the decimal no. system to something with   base 26
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
         
            char toAdd = (char)((n % 26) + 65);  // 65 is the ascii value of A
            result.insert(0,toAdd);
            
            n = n/26;
            
        }
        return result.toString();
        
    }
}
