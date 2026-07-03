class Solution {
    public int searchInsert(int[] nums, int target) {
        //first check if its there: 
        boolean there=false;
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                there=true;
                index=i;
                break;
            }
        }

        if(there){
            return index;

        }
        else{
            //chck if it is smaller than the first number:
            if(target<nums[0]){
                index=0;
            }
            //check if it is bigger than the last number:
            else if(target>nums[nums.length-1]){
                index=nums.length;
            }
            else{
                for(int i=1;i<nums.length;i++){
                    if(nums[i-1]<target & nums[i]>target){
                        index=i;
                    }
                }
            }
        }
        return index;
        


        
    }
}