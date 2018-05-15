/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbatubes;

import java.util.List;
import java.util.Scanner;



/**
 *
 * @author ghost
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analyzer a = new Analyzer();
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        
        for (Lexer l : a.lexers(in)) {
            System.out.println(l.getS() + " - " + l.getType());
        }
        
    }
    
}
