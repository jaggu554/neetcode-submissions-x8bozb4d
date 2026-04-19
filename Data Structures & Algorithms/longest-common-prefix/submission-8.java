class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs[0].length();
        for(int i=0;i<n;i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==i || strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}