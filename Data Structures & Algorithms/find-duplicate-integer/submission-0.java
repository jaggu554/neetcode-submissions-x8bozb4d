class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){

            while(nums[i]>=1 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                int correctIndex=nums[i]-1;

                int temp=nums[correctIndex];
                nums[correctIndex]=nums[i];
                nums[i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return n+1;
    }
}
