class Solution {
    public int majorityElement(int[] nums) {
        int element=nums[0];
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(element==nums[i]){
                count+=1;
            }else{
                count-=1;
            }

            if(count==0){
                element=nums[i];
                count=1;
            }
        }
       return element; 
    }
}