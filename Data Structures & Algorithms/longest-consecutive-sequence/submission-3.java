class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(Integer num:nums){
            set.add(num);
        }
        int max=0;
        
        for(int i=0;i<nums.length;i++){

            if(!set.contains(nums[i]-1)){
                int value=nums[i];
                int j=0;
                while(set.contains(value)){
                    value+=1;
                    j++;
                }
                max=Math.max(max,j);
            }
            
        }
        return max;
    }
}
