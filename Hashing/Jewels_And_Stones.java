/**
Ques.----> 771

**/


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
   
        
        
        // Approach  2  without using hashmap
        
        int num_JewelsCount=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))>-1)
                // indexOF search for first appearence
                num_JewelsCount += 1;
                
            
        }
        return num_JewelsCount;
    }
}
