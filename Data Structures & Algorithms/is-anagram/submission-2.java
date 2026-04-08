class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        int freqS[]=new int[26];
        int freqT[]=new int[26];

        for(int i=0;i<s.length();i++){
            freqS[s.charAt(i)-'a']++;
            freqT[t.charAt(i)-'a']++;
        }



        if(Arrays.equals(freqS,freqT)) return true;

    return false;
    }
}
