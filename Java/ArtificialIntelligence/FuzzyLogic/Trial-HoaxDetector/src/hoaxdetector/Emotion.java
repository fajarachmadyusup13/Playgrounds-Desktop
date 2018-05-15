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
public class Emotion {
        
    private double crispEmotion;
    
    private double fuzzyLow;
    private double fuzzyModerate;
    private double fuzzyHigh;
    
    private boolean low;
    private boolean moderate;
    private boolean high;

    public Emotion(double crispEmotion) {
        this.crispEmotion   = crispEmotion;
        this.low            = false;
        this.moderate       = false;
        this.high           = false;
        this.fuzzyLow       = 0;
        this.fuzzyModerate  = 0;
        this.fuzzyHigh      = 0;
    }

    public double getCrispEmotion() {
        return crispEmotion;
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

    public void setIsLow(boolean isLow) {
        this.low = isLow;
    }

    public void setIsModerate(boolean isModerate) {
        this.moderate = isModerate;
    }

    public void setIsHigh(boolean isHigh) {
        this.high = isHigh;
    }

    public boolean isLow() {
        return low;
    }

    public boolean isModerate() {
        return moderate;
    }

    public boolean isHigh() {
        return high;
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
    
    
    
    
    
}
