class Solution {
    public int maxSubArray(int[] nums) {
        int min=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>min){
                min=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return min;
    }
}