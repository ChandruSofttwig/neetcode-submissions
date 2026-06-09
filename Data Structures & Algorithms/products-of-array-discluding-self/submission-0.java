class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int post = 1;
        int[] out = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            out[i] = prefix;
            prefix *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
           out[i] *= post;  //12
           post *= nums[i];   //6 * 2
        }
        return out;
    }
}
