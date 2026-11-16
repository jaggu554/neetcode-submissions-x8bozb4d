class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
       for(int i=0;i<n;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);          
       } 

       List<Integer> buckets[]= new List[n+1];

       for(Integer key:map.keySet()){
        int freq=map.get(key);
        if(buckets[freq]==null){
            buckets[freq]=new ArrayList<>();
        }
        buckets[freq].add(key);
       }

       int res[]=new int[k];
       int index=0;

       for(int j=buckets.length-1 ;j>=0 && index<k;j--){
            if(buckets[j]!=null){
                for(int num:buckets[j]){
                    res[index]=num;
                    index++;
                    if(index==k) break;
                }
            }
       }
       return res;
    }
}
