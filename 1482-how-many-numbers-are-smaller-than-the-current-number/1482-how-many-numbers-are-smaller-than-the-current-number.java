class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int size=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
            arr[size]=count;
            size++;
        }
        return arr;
    }
}