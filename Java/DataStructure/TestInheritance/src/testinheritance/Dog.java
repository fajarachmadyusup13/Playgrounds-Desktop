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
public class Dog extends Animal{

    public Dog(int foot, String name, String food) {
        super(foot, name, food);
    }
    
    public void iCanBark(Barkable barkable) {
       barkable.iCanBark();
    }
}
