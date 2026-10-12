class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        for(int i=0;i<s.length();i++){
           
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,i-left+1);
            set.add(s.charAt(i));
        }
    return max==Integer.MIN_VALUE ? 0 :max;
    }
}
