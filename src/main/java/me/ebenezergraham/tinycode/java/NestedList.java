package me.ebenezergraham.tinycode.java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Ebenezer Kwesi Akyen Graham
 */
public class NestedList {
//    Question:
//    Return the color that occurs most frequently. In case of a tie, return the most frequent colors sorted alphabetically.
//
//    Args
//    Image: a nested list of color values
//
//    Example 1-- 
//    Input:
//
//    [
//      [ 'red', 'red', 'green',],
//      [ 'black', 'blue', 'black',],
//      [ 'red', 'yellow', 'yellow',]
//    ]
//    return [red]

    public static void main(String args[]) {
        List<List> colors = new ArrayList<List>();
        Map<Object, Integer> map = new HashMap<Object, Integer>();
        List<String> result = new ArrayList<String>();
        int max;
        
        //Used these three temp lists to replicate the question's nested List
        List<String> temp1 = new ArrayList<String>();
        List<String> temp2 = new ArrayList<String>();
        List<String> temp3 = new ArrayList<String>();
        
        temp1.add("red");
        temp1.add("red");
        temp1.add("green");
        //The colors list keeps track of lists hence the nested List
        colors.add(temp1);
        temp2.add("black");
        temp2.add("blue");
        temp2.add("black");
        colors.add(temp2);
        
        temp3.add("red");
        temp3.add("yellow");
        temp3.add("yellow");
        colors.add(temp3);

        System.out.println("Input: " + colors+"\n");
        //Used two loops to access the elements in the nested List
        for (List y : colors) {
            for (Object x : y) {
                //Used a HashMap (map) to keep track of the the colors
                // and the freqency.
                if (map.containsKey(x)) {
                    // if the key exists , get the value and increment by 1
                    map.put(x, map.get(x) + 1);
                } else {
                    // if it's not present then register the key and set value to 1
                    map.put(x, 1);
                }
            }
        }
        //Used the Collection interface to find the max value in the HashMap 
        max = Collections.max(map.values());
        // Used the Entry class to get the Key which have the same value has the 
        // highest frequency in the map
        for (Entry<Object, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                //Stored the key in the result List
                result.add(entry.getKey().toString());
            }
        }
        //Sorted the List and return the results
        Collections.sort(result);
        System.out.println(result);
    }
    
// This approach is for a non nested ArrayList
    
//    public static void main(String args[]) {
//        Collection<String> colors = new ArrayList<>();
//        List<String> result = new ArrayList<>();
//        List<String> temp = new ArrayList<>();
//        int max = 0;
//        
//        colors.add("red");
//        colors.add("red");
//        colors.add("yellow");
//        colors.add("black");
//        colors.add("black");
//        colors.add("black");
//        colors.add("red");
//        colors.add("yellow");
//        colors.add("yellow");
    
//        //Used a loop to iterate the List to determine which color
//        //occurs the most 
//  
//        for (String y : colors) {
//            if (!(result.contains(y)) && Collections.frequency(colors, y) >= max) {
//                max = Collections.frequency(colors, y);
//                result.add(y);
//            }
//        }
//        Collections.sort(result);
//        System.out.println(result);
//    }
}
