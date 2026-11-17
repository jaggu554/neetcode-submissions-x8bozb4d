class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){

            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-left+1);


        }
        return max==Integer.MIN_VALUE ? 0 : max;
    }
}
