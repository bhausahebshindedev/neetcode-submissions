class Solution {
  
    public int mul(int[]arr)
    {
        int res=1;
        for(int i:arr)
        {
            res=res*i;
        }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
       
       int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
          int temp=nums[i];
          nums[i]=1;
          ans[i]=mul(nums);
          nums[i]=temp;
       }
       return ans;

        
    }
}  
