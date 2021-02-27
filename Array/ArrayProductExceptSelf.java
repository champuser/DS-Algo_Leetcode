class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Approach1
        
//         int n= nums.length;
//         int[] left_Products = new int[ n];
//         int[] right_Products =new int[n];
//         int[] output = new int[n];
        
//         left_Products[0] = 1;
//         right_Products[n-1] = 1;
        
//         for(int i=1;i<n;i++){
//             left_Products[i] = nums[i-1] * left_Products[i-1];
            
//         }
//         for(int i=n-2;i>=0;i--){
//             right_Products[i] = nums[i+1] * right_Products[i+1];
//         }
        
//         for(int i=0;i<n;i++){
//             output[i] = left_Products[i] * right_Products[i];
//         }
//         return output;
        
        // Approach2 
        
        int n = nums.length;
        int output[] = new int[n];
        output[0] = 1;
        for(int i=1;i<n;i++){
            output[i] = nums[i-1] * output[i-1];
            
        }
        int products = 1;
        // from right update the output array
        for(int i= n-1;i>=0;i--){
             output[i] = output[i] * products;
            products = products * nums[i];
        }
        return output;
    }
}
