
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayra
 */
public class Quicksort {
    public static void main(String [] arg){
        System.out.println("QUICKSORT!!!");
        ArrayList<Integer> unsortedList = new ArrayList<Integer>();
        unsortedList.add(5);
        unsortedList.add(6);
        unsortedList.add(7);
        unsortedList.add(0);
        unsortedList.add(9);
        unsortedList.add(2018);
        unsortedList.add(1998);
        unsortedList.add(1);
        System.out.println("Unsorted List: " + unsortedList);
        
        ArrayList sortedList = quicksort(unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }
    
    public static ArrayList quicksort(ArrayList list)
    {
        ArrayList<Integer> less = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        
        if(list.size() > 1)
        {
            int pivot = (int) list.get(0);
            for(int i = 0; i < list.size(); i++)
            {
               if((int)list.get(i) < pivot)
               {
                   less.add((int)list.get(i));
               }else if(list.get(i).equals(pivot))
               {
                   equal.add((int)list.get(i));
               }else
               {
                   greater.add((int)list.get(i));
               }
            }
            return quicksort(less) + equal + quicksort(greater);
                    
        }else
        {
            return list;
        }
                
    }
}
