class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = s.length()-1;
        char[] ch = s.toCharArray();
        int max = 0;
        for(int i=0;i<ch.length;i++){
            while(set.contains(ch[i])){
                set.remove(ch[l]);
                l++;
            }
            set.add(ch[i]);
            max = Math.max(max,i-l+1);  //3
        }
        return max;
    }
}
