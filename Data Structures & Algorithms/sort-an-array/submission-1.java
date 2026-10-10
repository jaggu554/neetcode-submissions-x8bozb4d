class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            pq.add(nums[i]);

        }

        int i=0;
        while(pq.size()>0){
            nums[i]=pq.poll();
            i++;
        }

        return nums;
    }
}