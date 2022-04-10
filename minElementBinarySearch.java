import java.util.*;

class minElementBinarySearch
{
    public static int search(ArrayList<Integer>list)
    {
        int low=0;
        int high=list.size()-1;
        while(high>=low)
        {
            if(list.get(low)<=list.get(high))
                return low; //base case already sorted 0 rotation
            
            int mid=low+(high-low)/2;
            int next=(mid+1)%list.size();
            int prev=(mid-1+list.size())%list.size();
            
            if(list.get(mid)<=list.get(next) && list.get(mid)<=list.get(prev))
                return mid;
            if(list.get(mid)<=list.get(high))
                high=mid-1;
            if(list.get(mid)>=list.get(low))
                low=mid+1;
    
        }
        return -1;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list= new ArrayList<Integer>();
        list.add(12);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(11);

        //int key=40;
        System.out.println(search(list));   
    }
}
