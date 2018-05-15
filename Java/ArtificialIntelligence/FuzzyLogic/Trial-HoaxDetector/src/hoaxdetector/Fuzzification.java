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
public class Fuzzification implements Operations.fuzzification {

    
    
    @Override
    public void checkEmotion(Emotion emotion) {
        if (emotion.getCrispEmotion() >= Limit.LOWEST_LIMIT_LOW
                && emotion.getCrispEmotion() <= Limit.HIGHEST_LIMIT_LOW) {
            emotion.setIsLow(true);
        }
        if (emotion.getCrispEmotion() >= Limit.LOWEST_LIMIT_MODERATE
                && emotion.getCrispEmotion() <= Limit.HIGHEST_LIMIT_MODERATE) {
            emotion.setIsModerate(true);
        }
        if (emotion.getCrispEmotion() >= Limit.LOWEST_LIMIT_HIGH
                && emotion.getCrispEmotion() <= Limit.HIGHEST_LIMIT_HIGH) {
            emotion.setIsHigh(true);
        }
    }

    @Override
    public void checkProvocation(Provocation provocation) {
        if (provocation.getCrispProvocation() >= Limit.LOWEST_LIMIT_LOW
                && provocation.getCrispProvocation() <= Limit.HIGHEST_LIMIT_LOW) {
            provocation.setIsLow(true);
        }
        if (provocation.getCrispProvocation() >= Limit.LOWEST_LIMIT_MODERATE
                && provocation.getCrispProvocation() <= Limit.HIGHEST_LIMIT_MODERATE) {
            provocation.setIsModerate(true);
        }
        if (provocation.getCrispProvocation() >= Limit.LOWEST_LIMIT_HIGH
                && provocation.getCrispProvocation() <= Limit.HIGHEST_LIMIT_HIGH) {
            provocation.setIsHigh(true);
        }
    }

    @Override
    public double convertToSecondLow(double crispEmotion) {
        return -(crispEmotion - Limit.HIGHEST_LIMIT_LOW)/(Limit.HIGHEST_LIMIT_LOW - Limit.LOWEST_LIMIT_MODERATE);
    }

    @Override
    public double convertToFirstModerate(double crispEmotion) {
        return (crispEmotion - Limit.LOWEST_LIMIT_MODERATE)/(Limit.HIGHEST_LIMIT_LOW - Limit.LOWEST_LIMIT_MODERATE);
    }
    
    @Override
    public double convertToSecondModerate(double crispEmotion) {
        return -(crispEmotion - Limit.HIGHEST_LIMIT_MODERATE)/(Limit.HIGHEST_LIMIT_MODERATE - Limit.LOWEST_LIMIT_HIGH);
    }

    @Override
    public double convertToFirstHigh(double crispEmotion) {
        return (crispEmotion - Limit.LOWEST_LIMIT_HIGH)/(Limit.HIGHEST_LIMIT_MODERATE - Limit.LOWEST_LIMIT_HIGH);
    }
    
    @Override
    public void convertEmotion(ArrayList<News> listNews) {
        listNews.forEach((news) -> {
            Emotion emotion = news.getEmotion();
            double crisp       = emotion.getCrispEmotion();
            
            if (emotion.isLow()) {
                if (crisp <= Limit.LOWEST_LIMIT_LOW || crisp >= Limit.HIGHEST_LIMIT_LOW) {
                    emotion.setFuzzyLow(0);
                } else if(crisp > Limit.LOWEST_LIMIT_LOW && crisp <=  Limit.LOWEST_LIMIT_MODERATE) {
                    emotion.setFuzzyLow(1);
                } else if(crisp > Limit.LOWEST_LIMIT_MODERATE && crisp < Limit.HIGHEST_LIMIT_LOW){
                    emotion.setFuzzyLow(convertToSecondLow(crisp));
                    emotion.setFuzzyModerate(convertToFirstModerate(crisp));
                }
            }
            if (emotion.isModerate()) {
                if (crisp <= Limit.LOWEST_LIMIT_MODERATE || crisp >= Limit.HIGHEST_LIMIT_MODERATE) {
                    emotion.setFuzzyModerate(0);
                } else if(crisp >= Limit.HIGHEST_LIMIT_LOW && crisp <= Limit.LOWEST_LIMIT_HIGH) {
                    emotion.setFuzzyModerate(1);
                } else if(crisp > Limit.LOWEST_LIMIT_HIGH && crisp < Limit.HIGHEST_LIMIT_MODERATE) {
                    emotion.setFuzzyModerate(convertToSecondModerate(crisp));
                    emotion.setFuzzyHigh(convertToFirstHigh(crisp));
                }
            }
            if (emotion.isHigh()) {
                if (crisp <= Limit.LOWEST_LIMIT_HIGH || crisp >= Limit.HIGHEST_LIMIT_HIGH) {
                    emotion.setFuzzyHigh(0);
                } else if(crisp >= Limit.HIGHEST_LIMIT_MODERATE && crisp < Limit.HIGHEST_LIMIT_HIGH) {
                    emotion.setFuzzyHigh(1);
                }
            }
        });
    }

    @Override
    public void convertProvocation(ArrayList<News> listNews) {
        listNews.forEach((news) -> {
            Provocation provocation = news.getProvocation();
            double crisp       = provocation.getCrispProvocation();
            
            if (provocation.isLow()) {
                if (crisp <= Limit.LOWEST_LIMIT_LOW || crisp >= Limit.HIGHEST_LIMIT_LOW) {
                    provocation.setFuzzyLow(0);
                } else if(crisp > Limit.LOWEST_LIMIT_LOW && crisp <  Limit.LOWEST_LIMIT_MODERATE) {
                    provocation.setFuzzyLow(1);
                } else if(crisp > Limit.LOWEST_LIMIT_MODERATE && crisp < Limit.HIGHEST_LIMIT_LOW){
                    provocation.setFuzzyLow(convertToSecondLow(crisp));
                    provocation.setFuzzyModerate(convertToFirstModerate(crisp));
                }
            }
            if (provocation.isModerate()) {
                if (crisp <= Limit.LOWEST_LIMIT_MODERATE || crisp >= Limit.HIGHEST_LIMIT_MODERATE) {
                    provocation.setFuzzyModerate(0);
                } else if(crisp > Limit.HIGHEST_LIMIT_LOW && crisp < Limit.LOWEST_LIMIT_HIGH) {
                    provocation.setFuzzyModerate(1);
                } else if(crisp > Limit.LOWEST_LIMIT_HIGH && crisp < Limit.HIGHEST_LIMIT_MODERATE) {
                    provocation.setFuzzyModerate(convertToSecondModerate(crisp));
                    provocation.setFuzzyHigh(convertToFirstHigh(crisp));
                }
            }
            if (provocation.isHigh()) {
                if (crisp <= Limit.LOWEST_LIMIT_HIGH || crisp >= Limit.HIGHEST_LIMIT_HIGH) {
                    provocation.setFuzzyHigh(0);
                } else if(crisp > Limit.HIGHEST_LIMIT_MODERATE && crisp < Limit.HIGHEST_LIMIT_HIGH) {
                    provocation.setFuzzyHigh(1);
                }
            }
        });
    }

    

    

}
