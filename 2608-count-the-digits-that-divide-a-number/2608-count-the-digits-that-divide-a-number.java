class Solution {
    public int countDigits(int num) {
        int tem=num;
        int count=0;
        while(num!=0)
        {
            int a=num%10;
            if(tem%a==0)
                count++;
            num/=10;
        }
        return count;
    }
}