class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
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