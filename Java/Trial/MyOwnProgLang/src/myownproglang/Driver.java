/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproglang;

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
        Lexer l = new Lexer();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        
        if (in.length()<1) {
            System.out.println("WOOOOO");
        }
        
        
        List<Token> tokens = l.lex(in);
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
    
    
    
}
