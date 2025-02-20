//LINK : https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int s = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i : nums){
            s+=i;
            maxi = Math.max(maxi,s);
            if(s<0) s=0;
        }
        return maxi;
    }
}
