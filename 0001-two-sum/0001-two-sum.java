class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]indexes=new int[2];//because we know each input would have only one solution
        for(int i=0; i<nums.length; i++){
            for(int k=i+1; k<nums.length; k++){
                if(nums[i]+nums[k]==target){
                    indexes[0]=i;
                    indexes[1]=k;
                    break;
                }
            }

        }
        return indexes;
    }
}