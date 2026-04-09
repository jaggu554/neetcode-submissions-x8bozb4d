class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            char ar[]=strs[i].toCharArray();
            Arrays.sort(ar);
            String s=new String(ar);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());  
            }
            map.get(s).add(strs[i]);
        }
        for(Map.Entry<String,List<String>> m:map.entrySet()){
            result.add(m.getValue());

        }
        return result;
    }
}
