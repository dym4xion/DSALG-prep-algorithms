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
public class BubbleSort {
    public static void main(String [] arg){
        System.out.println("BUBBLE SORT!!!");
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
        
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sortedList = bubble_sort(unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }
    
    public static ArrayList bubble_sort(ArrayList unsortedList)
    {
        for(int i = 0; i < unsortedList.size() - 1; i++)
        {
            unsortedList = iterate_list(unsortedList);
        }
        return unsortedList;
    }
    
    public static ArrayList iterate_list(ArrayList list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            int focusIt = (int) list.get(i);
            int nextIt = (int) list.get(i + 1);
            if(focusIt > nextIt)
            {
                list.set(i, nextIt);
                list.set(i +1, focusIt);
            }
            
        }
        return list;
            
    }
}
//completed