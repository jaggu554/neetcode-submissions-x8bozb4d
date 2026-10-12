class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int result[]=new int[n];

      int prefix[]=new int[n];
      int suffix[]=new int[n];

      prefix[0]=nums[0];

      suffix[n-1]=nums[n-1];

      for(int i=1;i<n;i++){

        prefix[i]=prefix[i-1]*nums[i];

      }

      for(int j=n-2;j>=0;j--){
        suffix[j]=suffix[j+1]*nums[j];
      }

      for(int k=0;k<n;k++){
        
        if(k==0){
            result[k]=suffix[k+1];
        }else if(k==n-1){
            result[k]=prefix[k-1];
        }else{
            result[k]=prefix[k-1]*suffix[k+1];
        }
      }
      return result;

    }
}  
