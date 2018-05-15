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
public class Animal {
    private int foot;
    private String name;
    private String food;

    public Animal(int foot, String name, String food) {
        this.foot = foot;
        this.name = name;
        this.food = food;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    
    
}
