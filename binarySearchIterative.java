import java.util.*;
class binarySearchIterative
{
    public static int search(int key, ArrayList<Integer>list)
    {
        int low=0;
        int high=list.size()-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(list.get(mid)==key)
                return mid+1;
            else if(list.get(mid)<key)
                low=mid+1;
            else
                high=mid-1;         
        }
        return -1;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int key=90;
    
        int ans=search(key,list);
        if(ans==-1)
          System.out.println("NOT FOUND");
        else 
          System.out.println("FOUND AT: "+ ans); 
        
    }
}
