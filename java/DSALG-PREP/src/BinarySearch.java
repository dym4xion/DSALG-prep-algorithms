
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
public class BinarySearch {
    public static void main(String [] arg){
        System.out.println("BINARY SEARCH!!!");
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sortedList.add(1);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(5);
        sortedList.add(8);
        sortedList.add(13);
        sortedList.add(21);
        sortedList.add(33);
        System.out.println(sortedList);
        
        Integer target = 13;
        Integer index;
        binarySearch(sortedList, target);
    }
    
    public static void binarySearch(ArrayList list, Integer target)
    {
        Integer bottomLimit = 0; 
	Integer upperLimit = list.size();
	Boolean found = false;
	Boolean inList = true;
	Integer indexPos = null;
        
        while(!found)
        {
            Integer focusIndex = Math.round((bottomLimit + upperLimit) / 2);
            Integer focusValue = (Integer) list.get(focusIndex);
            
            if(focusValue.equals(target))
            {
                found = true;
                indexPos = focusIndex;
            }else if(target < focusValue)
            {
                System.out.println("target is less than ... ignore latter half");
                upperLimit = focusIndex;
            }else if(target > focusValue)
            {
                System.out.println("target is greater than ... ignore former half");
                bottomLimit = focusIndex;
            }
            
            if(upperLimit.equals(bottomLimit + 1))
            {
                found = true;
                inList = false;
            }
            
        }
        
        if(! inList)
        {
            System.out.println("target not in list");
        }
        else
        {
            String posString = Integer.toString(indexPos);
            System.out.println("target in list at position: " + posString);
        }
        
    }
}
