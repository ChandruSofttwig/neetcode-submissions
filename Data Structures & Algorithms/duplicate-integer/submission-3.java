class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int n:nums){
        if(!set.add(n)){
            return true;
        }
        }
        
    return false;
    }
}