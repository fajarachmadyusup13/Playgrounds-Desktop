/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsubrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ghost
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FindSubRow fsr = new FindSubRow(1, 4);
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(new Integer[] {1, 4, 2, 3, 2, 7, 1, 2, 3}));
        fsr.findSubRow(al);
    }
    
}
