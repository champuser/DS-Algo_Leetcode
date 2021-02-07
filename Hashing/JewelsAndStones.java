/**
Ques.--->771
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0




**/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();
        for(char c:jewels.toCharArray()){
            // checking for each character in string jewels & add it to hashSet
            jewelsSet.add(c);
        }
        int numJewels=0;    // initially count of numJewels
        for(char c:stones.toCharArray()){
            if(jewelsSet.contains(c))
                numJewels++;
        }
        return numJewels;
        
    }
}
