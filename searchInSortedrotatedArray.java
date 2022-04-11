import java.util.*;
// anuj bhaiya
// first we check whether the middle element is it or not, if not we find which part of the array is sorted and check if the element is present in the sorted part by bounds check
// if one part is sorted then other will be sorted because in rotations we are basically shifting the two sorted parts
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            
            if(nums[mid]== target)
                return mid;
            
            //check for the sorted part
            
            //left part sorted
            else if(nums[mid]>=nums[low])
            {
                //checking range
                if(target>=nums[low] && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(target>nums[mid] && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        ArrayList<Integer>list= new ArrayList<Integer>();
        list.add(50);
        list.add(60);
        list.add(90);
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);

        int key=40;
        System.out.println(search(key, list));   
    }
}
