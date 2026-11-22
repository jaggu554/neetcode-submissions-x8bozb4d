class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();

         int n=s.length();
         int max=Integer.MIN_VALUE;
        int left=0;
         for(int i=0;i<n;i++){

            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,i-left+1);
            set.add(s.charAt(i));
         }
         return max==Integer.MIN_VALUE ? 0 : max;
    }
}
