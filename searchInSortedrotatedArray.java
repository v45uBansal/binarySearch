import java.util.*;
// anuj bhaiya
// first we check whether the middle element is it or not, if not we find which part of the array is sorted and check if the element is present in the sorted part by bounds check
// if one part is sorted then other will be sorted because in rotations we are basically shifting the two sorted parts
class searchInSortedrotatedArray
{
    public static int search(int key, ArrayList<Integer>list)
    {
        int low=0;
        int high=list.size()-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            
            if(list.get(mid)==key)
                return mid;
            //which part is sorted
            if(list.get(low)<list.get(mid))
            {
                //left part is sorted
                if(list.get(low)<=key && list.get(mid)>key)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(key>list.get(mid) && key<=list.get(high))
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
