
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
public class LinearSearch {
    public static void main(String [] arg){
        System.out.println("LINEAR SEARCH!!!");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);
        list.add(33);
        System.out.println(list);
        
        int target = 13;
        linearSearch(list, target);
    }
    
    public static void linearSearch(ArrayList list, int target)
    {
        boolean inList = false;
        Integer index = 0;
        
        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(target))
            {
                inList = true;
                System.out.println("value found at index position " + index);
            }else
            {
                index += 1;
            }
        }
        if(! inList)
        {
            System.out.println("target value not in list");
        }
        
    }
}
