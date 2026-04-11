class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max=0;
        
        for(int i=0;i<nums.length;i++){
            int length=0;
            int next=nums[i];
            if(!set.contains(nums[i]-1)){

            while(set.contains(next)){
                length++;
                next++;
            }
            max=Math.max(max,length);
            }
            
        }
        return max;
    }
}
