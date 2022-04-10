import java.util.*;

class firstOccurence
{
    public static int search(int key, ArrayList<Integer>list)
    {
        int low=0;
        int high=list.size()-1;
        int temp=-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(list.get(mid)==key)
            {
                temp=mid;
                high=mid-1;
                //return mid+1;
            }
            else if(list.get(mid)<key)
                low=mid+1;
            else
               high=mid-1;
        }
        return temp;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list= new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(40);
        list.add(50);

        int key=4;
        System.out.println(search(key, list));   
    }
}
