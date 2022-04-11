class Solution {
    public int findPeakElement(int[] nums)
    {
        if(nums.length==1)
            return 0;
        int low=0;
        int high=nums.length-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(mid>0 && mid<nums.length-1)
            {
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                    return mid;
                else if(nums[mid]<nums[mid+1] && nums[mid]>nums[mid-1])
                     low=mid+1;
                else
                    high=mid-1;
            }
            else if(mid==0)
            {
                if(nums[mid]> nums[mid+1])
                    return mid;
                return mid+1;
            }
            else
            {
                if(nums[mid]>nums[mid-1])
                    return mid;
                else
                    return mid-1;
            }
            
        }
        return -1;
    }
}
