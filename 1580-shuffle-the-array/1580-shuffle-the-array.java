class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n*2];
        for(int i=0;i<n*2;i++)
        {
            if(i%2==0)
                arr1[i]=nums[i/2];
            else
                arr1[i]=nums[n+i/2];
        }
        return arr1;
    }
}