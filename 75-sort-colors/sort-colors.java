class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex=0, oneIndex=0, twoIndex=nums.length-1, temp=0;
        while(oneIndex<=twoIndex){
            if(nums[oneIndex]==0){
                nums[oneIndex] = nums[zeroIndex];
                nums[zeroIndex] = 0;
                zeroIndex++;
                oneIndex++;
            }
            else if(nums[oneIndex]==2){
                nums[oneIndex] = nums[twoIndex];
                nums[twoIndex] = 2;
                twoIndex--;
            }
            else if(nums[oneIndex]==1) oneIndex++;
        }

    }
}