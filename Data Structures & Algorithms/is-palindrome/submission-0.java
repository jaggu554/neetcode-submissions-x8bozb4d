class Solution {
    public boolean isPalindrome(String s) {
       String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        int low=0;
        int high=str.length()-1;

        while(low<=high){
            if(str.charAt(low)!=str.charAt(high)){
                System.out.println(str.charAt(low)+ " fjfj "+str.charAt(high));
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
