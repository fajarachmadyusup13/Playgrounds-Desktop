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
public class Token {

    public final Type t;
    public final String c;

    public Token(Type t, String c) {
        this.t = t;
        this.c = c;
    }       
    

    @Override
    public String toString() {
        if (this.t == Type.ATOM) {
            return "ATOM<"+ "asdasd" +">";
        }
        return t.toString();
    }
    
    
}
