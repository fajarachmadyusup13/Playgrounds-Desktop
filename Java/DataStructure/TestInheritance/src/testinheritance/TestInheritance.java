/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritance;

/**
 *
 * @author ghost
 */
public class TestInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d = new Dog(4, "Buddy", "Meat");
        d.iCanBark(new ImpBarkable());
//        d.iCanBark(new Barkable() {
//            @Override
//            public void iCanBark() {
//                System.out.println("Boooom");
//            }
//        });
    }
    
}
