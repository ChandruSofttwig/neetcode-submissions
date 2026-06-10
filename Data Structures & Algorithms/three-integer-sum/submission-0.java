class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int init = 0;
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            init = nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int threeSum = init + nums[l] + nums[r];
                if(threeSum < 0){
                    l++;
                }else if(threeSum > 0){
                    r--;
                }else if(threeSum == 0){
                    list.add(Arrays.asList(init,nums[l],nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l < r ){
                        l++;
                    }
                }
            }
        }
        return list;
    }
}
