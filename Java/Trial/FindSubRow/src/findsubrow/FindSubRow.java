/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsubrow;

import java.util.ArrayList;

/**
 *
 * @author ghost
 */
public class FindSubRow {
    
    private int firstLimit;
    private int secondLimit;
    private int longestCase;
    private ArrayList<Integer> longestTemp;
    private ArrayList<Integer> longestSubRow;
    

    public FindSubRow(int firstLimit, int secondLimit) {
        this.firstLimit = firstLimit;
        this.secondLimit = secondLimit;
        this.longestTemp = new ArrayList<>();
        this.longestSubRow = longestTemp;
        this.longestCase = 0;
    }
    
    
    
    
    public void findSubRow(ArrayList<Integer> list){
        int indexCounter = 0;
        int j;
        for (int i = 0; i < list.size()-1; i++) {   
            j =i;
            longestTemp = new ArrayList<>();
            while (j < list.size()-1) {                
                longestTemp.add(list.get(j));
                System.out.print(list.get(j));
                j += list.get(j);
            
            }
            
            if (longestTemp.size()> longestSubRow.size()) {
                longestSubRow = longestTemp;
                longestCase = i;
            }
//            System.out.println(longestTemp.size());
            System.out.print("\t\tCase#"+i+": "+longestTemp.size());
            System.out.println("");
//            longestSubRow.forEach((tes) -> {
//                System.out.print(tes);
//            });
        }
        System.out.println("");
        System.out.println("Longest: \tCase#"+ longestCase + ": " + longestSubRow.size());
    }
}
