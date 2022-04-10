import java.util.*;

class binarySearchRecursive
{
    public static int search(int key, ArrayList<Integer>list, int low, int high)
    { 
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if(list.get(mid)==key)
                return mid+1;
            else if(list.get(mid)<key)
               return search(key, list, mid+1,high);
            else       
                return search(key, list, low, mid-1);
        }
        return -1;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list= new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        int key=1000;
        // for(int i=0;i<list.size();i++)
        //     System.out.println(list.get(i));
        int low=0;
        int high=list.size()-1;
        int ans=search(key, list, low, high);
        if(ans==-1)
            System.out.println("NOT FOUND");
        else
           System.out.println("FOUND AT: " + ans);    
    }
}
