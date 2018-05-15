/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbatubes;

/**
 *
 * @author ghost
 */
public class Lexer {
    private Type type;
    private String s;

    public Lexer(Type type, String s) {
        this.type = type;
        this.s = s;
    }

    public Type getType() {
        return type;
    }

    public String getS() {
        return s;
    }
    
    
}
