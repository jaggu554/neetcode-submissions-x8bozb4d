class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> a-b);

        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        for(int i=0;i<nums.length;i++){

            pq.add(nums[i]);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
    return pq.peek();
    }
}
