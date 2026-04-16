class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[slow]!=nums[i]){
                slow++;
                nums[slow]=nums[i];
            }
        }
        return slow+1;
    }
}