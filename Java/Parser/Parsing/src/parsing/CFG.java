/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ghost
 */
public class CFG {
    Map<String, String[]> rules;

    public CFG() {
        this.rules = new HashMap<>();
        rules.put("S", new String[]{"The N V"});
        rules.put("N", new String[]{"Cat", "Dog"});
        rules.put("V", new String[]{"Meows", "Barks"});
    }
    
    public void operations() {
        String start = "S";
        String[] expansion = new String[100];
        
        String result = expand(start, expansion);
        
    }
    
    public String expand(String start, String[] exp){
        if (rules.get(start)!= null) {
//            String pick = random
        }
        return "";
    }
    
    
}
