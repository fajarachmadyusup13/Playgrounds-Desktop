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
public interface Operations {
    interface fuzzification {
        public void checkEmotion(Emotion emotion);
        public void checkProvocation(Provocation provocation);
        public void convertEmotion(ArrayList<News> listNews);
        public void convertProvocation(ArrayList<News> listNews);
        public double convertToSecondLow(double crispEmotion);
        public double convertToFirstModerate(double crispEmotion);
        public double convertToSecondModerate(double crispEmotion);
        public double convertToFirstHigh(double crispEmotion);
    }
    
    interface inference {
        public void compareNews(News news);
        public Hoax compareHoax(ArrayList<Hoax> hoaxs);
        public Hoax compareAlliedHoax(ArrayList<Hoax> hoaxs);
        public Hoax compareToThreshold(ArrayList<Hoax> hoaxs);
        public double delta(Hoax h);
        
    }
    
    interface defuzzification {
        public Hoax countYStarSingle(Hoax h);
        public Hoax countYStarMultipe(ArrayList<Hoax> h);
    }
}
