class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr1[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr1[i]=nums[i];
        }
        int index=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            arr1[index]=nums[i];
            index++;
        }
    return arr1;
    }
}