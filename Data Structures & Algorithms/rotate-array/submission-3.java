class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        reverse(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,0,(k%n)-1);
                System.out.println(Arrays.toString(nums));

        reverse(nums,k%n,n-1);

    }

    public static void reverse(int[] nums,int left,int right){

        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}