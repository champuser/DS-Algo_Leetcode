/**
Ques.---> 14
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


**/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 1;
int count = 2;
String pre = "";
boolean exit = false;

    if (strs.length == 1) {
        return strs[0];
    }
    
    if (strs.length < 1) {
        return pre;
    }
    
    while (index <= strs[0].length() && index <= strs[1].length()) {
        
        pre = strs[0].substring(0, index);
        
        if (pre.equals(strs[1].substring(0, index)) == true) {
            index++;
        } else {
            index--;
            pre = pre.substring(0, index);
            break;
        }
    }
    
    if (pre.length() > 0) {
        index = pre.length();
        
        for (int i = 2; i < strs.length; i++) {
            if (pre.length() < 1) {
                break;
            }
            
            if (strs[i].length() < index) {
                index = strs[i].length();
                pre = pre.substring(0, index);
            }
            
            while (pre.length() > 0) {
                if (pre.equals(strs[i].substring(0, index))) {
                    break;
                } else {
                    index--;
                    pre = pre.substring(0, index);
                }
            }
            
        }
    }

    return pre;        
        
    }
}
