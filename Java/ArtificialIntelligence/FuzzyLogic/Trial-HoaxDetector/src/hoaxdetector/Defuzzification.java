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
public class Defuzzification implements Operations.defuzzification{

    @Override
    public Hoax countYStarSingle(Hoax h) {
        Hoax hx = new Hoax();
        double yStar = 0;
        if (h.isTrue()) {
            yStar = (Limit.SUGENO_TRUE * h.getMembershipHoax() + 0) / (Limit.SUGENO_TRUE + Limit.SUGENO_FALSE);
        }else {
            yStar = (Limit.SUGENO_FALSE * h.getMembershipHoax() + 0) / (Limit.SUGENO_TRUE + Limit.SUGENO_FALSE);
        }
        hx.setMembershipHoax(yStar);
        if (yStar >= Limit.THRESHOLD) {
            hx.setIsTrue(true);
        }else {
            hx.setIsTrue(false);
        }
        return hx;
    }

    @Override
    public Hoax countYStarMultipe(ArrayList<Hoax> h) {
        Hoax hx = new Hoax();
        double yStar = 0;
        if (h.get(0).isTrue()) {
            yStar = ((Limit.SUGENO_TRUE * h.get(0).getMembershipHoax()) + (Limit.SUGENO_FALSE * h.get(1).getMembershipHoax())) / (Limit.SUGENO_TRUE + Limit.SUGENO_FALSE);
        }else if(h.get(1).isTrue()) {
            yStar = ((Limit.SUGENO_TRUE * h.get(1).getMembershipHoax()) + (Limit.SUGENO_FALSE * h.get(0).getMembershipHoax())) / (Limit.SUGENO_TRUE + Limit.SUGENO_FALSE);
        }
        hx.setMembershipHoax(yStar);
        if (yStar >= Limit.THRESHOLD) {
            hx.setIsTrue(true);
        }else {
            hx.setIsTrue(false);
        }
        return hx;
    }
}
