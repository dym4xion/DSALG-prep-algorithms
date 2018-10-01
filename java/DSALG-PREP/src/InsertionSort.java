
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
public class InsertionSort {
    public static void main(String [] arg){
        System.out.println("INSERTION SORT!!!");
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
        sortedList = insertion_sort(unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }
    
    public static ArrayList insertion_sort(ArrayList list)
    {
        for(int i = 1; i < list.size(); i++)
        {
            int focusValue = (int) list.get(i);
            int prevIndex = i - 1;
            while((prevIndex > -1) && (focusValue < (int)list.get(prevIndex)))
            {
                list.set(prevIndex + 1, list.get(prevIndex));
                prevIndex -= 1;
            }
            list.set(prevIndex + 1, focusValue);
        }
        
        return list;
    }
}
//complete
