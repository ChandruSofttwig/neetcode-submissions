class Solution {
    public int[] getConcatenation(int[] nums) {
          int start = 0;

       int[] nums1 = new int[nums.length* 2];
       for(int i=0;i<nums.length;i++){
        nums1[i] = nums[i];
        
       }
       for(int i=nums.length;i<nums.length*2;i++){
        nums1[i] = nums[start];
        start ++;
       }
    return nums1;
    }
}