/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myownproglang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ghost
 */
public class Lexer {
    
    public String getAtom(String s, int i) {
        int j = i;
        for (; j < s.length(); ) {
            if (Character.isLetter(s.charAt(j))) {
                j++;
            } else {
                return s.substring(i, j);
            }
        }
        return s.substring(i, j);
    }
    
    
    public List<Token> lex(String input) {
        List<Token> result = new ArrayList<Token>();
        for (int i = 0; i < input.length(); i++) {
            switch(input.charAt(i)){
                case '(':
                    result.add(new Token(Type.LPARENT, "("));
                    i++;
                    break;
                case ')':
                    result.add(new Token(Type.RPARENT, ")"));
                    i++;
                    break;
                default:
                    if (Character.isWhitespace(input.charAt(i))) {
                        i++;
                    }else{
                        String atom = getAtom(input, i);
                        i += atom.length();
                        result.add(new Token(Type.ATOM, atom));
                    }
                    break;
            }
        }
        return result;
    }
}
