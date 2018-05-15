/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbatubes;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author ghost
 */
public class Analyzer {
    
    public ArrayList<Lexer> lexers (String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<Lexer> ls = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            ls.add(new Lexer(Type.OPR, st.nextToken()));
        }
        
        return ls;
        
    }
    
}
