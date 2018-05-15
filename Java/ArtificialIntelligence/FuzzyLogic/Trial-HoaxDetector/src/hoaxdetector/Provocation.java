/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaxdetector;


import java.util.ArrayList;

/**
 *
 * @author ghost
 */
public class Provocation {
        
    private double crispProvocation;
    
    private double fuzzyLow;
    private double fuzzyModerate;
    private double fuzzyHigh;
    
    private boolean isLow;
    private boolean isModerate;
    private boolean isHigh;

    public Provocation(double crispProvocation) {
        this.crispProvocation   = crispProvocation;
        this.isLow              = false;
        this.isModerate         = false;
        this.isHigh             = false;
        this.fuzzyLow       = 0;
        this.fuzzyModerate  = 0;
        this.fuzzyHigh      = 0;
    }

    public double getCrispProvocation() {
        return crispProvocation;
    }

    public void setIsLow(boolean isLow) {
        this.isLow = isLow;
    }

    public void setIsModerate(boolean isModerate) {
        this.isModerate = isModerate;
    }

    public void setIsHigh(boolean isHigh) {
        this.isHigh = isHigh;
    }

    public boolean isLow() {
        return isLow;
    }

    public boolean isModerate() {
        return isModerate;
    }

    public boolean isHigh() {
        return isHigh;
    }

    public double getFuzzyLow() {
        return fuzzyLow;
    }

    public double getFuzzyModerate() {
        return fuzzyModerate;
    }

    public double getFuzzyHigh() {
        return fuzzyHigh;
    }

    public void setFuzzyLow(double fuzzyLow) {
        this.fuzzyLow = fuzzyLow;
    }

    public void setFuzzyModerate(double fuzzyModerate) {
        this.fuzzyModerate = fuzzyModerate;
    }

    public void setFuzzyHigh(double fuzzyHigh) {
        this.fuzzyHigh = fuzzyHigh;
    }
    
    
    
    
    
}
