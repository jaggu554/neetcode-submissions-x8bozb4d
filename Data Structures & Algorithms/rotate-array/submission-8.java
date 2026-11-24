class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
       k=k%n;
      reverse(0,n-1,nums);
      System.out.println(Arrays.toString(nums));
      reverse(0,k-1,nums);
      System.out.println(Arrays.toString(nums));
      reverse(k,n-1,nums);  
    }

    public void reverse(int j,int l,int nums[]){
        while(j<l){
            int temp =nums[j];
            nums[j]=nums[l];
            nums[l]=temp;
            j++;
            l--;
        }
    }
}