class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int init = 0;
        int max = 0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num - 1)){
                init = num;
                count = 1;
                while(set.contains(init+1)){
                    init = init + 1;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
