class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
    //    System.out.println(map);

        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b) -> map.get(a) -map.get(b)
        );
        int res[]=new int[k];
        for(Integer key: map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int j=0;
        while(pq.size()>0){
            res[j]=pq.poll();
            j++;
        }
        
       return res;
    }
}
