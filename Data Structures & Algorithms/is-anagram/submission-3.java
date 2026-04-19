class Solution {
    public boolean isAnagram(String s, String t) {
        int freqS[]=new int[26];
        int freqT[]=new int[26];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            freqS[s.charAt(i)-'a']++;
            freqT[t.charAt(i)-'a']++;
        }

        return Arrays.equals(freqS,freqT);
    }
}
