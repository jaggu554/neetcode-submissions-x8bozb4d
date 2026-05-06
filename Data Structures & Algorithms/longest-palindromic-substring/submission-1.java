class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        
        int start=0;
        int end=0;
        int maxLen=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int l=expand(s,i,i);
            int r=expand(s,i,i+1);
            maxLen=Math.max(l,r);

            if(maxLen > end-start+1){
                start=i-(maxLen-1)/2;
                end=i+maxLen/2;
            }

        }
        return s.substring(start,end+1);
    }

    public static int expand(String s,int left,int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
           left--;
            right++;
        }

    return right-left-1;
    }
}
