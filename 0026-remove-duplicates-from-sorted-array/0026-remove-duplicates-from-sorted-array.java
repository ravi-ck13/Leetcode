class Solution {
    public int removeDuplicates(int[] nums) {
        int uniq=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[uniq]!=nums[i])
            {
                nums[uniq+1]=nums[i];
                uniq++;
            }
            
        }
        return uniq+1;
    }
}