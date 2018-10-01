
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
public class SelectionSort {
    public static void main(String [] arg){
        System.out.println("SELECTION SORT!!!");
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
        
        ArrayList sortedList = selection_sort(unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }
    
    public static ArrayList selection_sort(ArrayList list)
    {
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        
        for(int i = 0; i < list.size(); i++)
        {
            int smallest = find_smallest(list);
            sortedList.add((Integer) list.get(smallest));
            list.remove(smallest);
        }
                
        return sortedList;
    }
    
    public static int find_smallest(ArrayList subList)
    {
        int smallest = (int) subList.get(0);
        int smallestIndex = 0;
        for(int i = 1; i < subList.size(); i++)
        {
            if((int) subList.get(i) < smallest)
            {
                smallest = (int) subList.get(i);
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
        
    
}

