class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          int  find=nums[i];
            int count=0;
            if(!set.contains(find-1)){
            while(set.contains(find)){
                find=find+1;
                count++;
            }
            max=Math.max(count,max);
            }
            
        }
        return max;
    }
}
