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
public class HoaxDetector {
    private ArrayList<News> listNews;
    private Operations.fuzzification fuzzification;
    private Operations.inference inference;

    public HoaxDetector() {
        this.listNews = new ArrayList<>();
        this.fuzzification = new Fuzzification();
        this.inference = new Inference();
    }  
    
    public void addNews(News news) {
       this.listNews.add(news);
    } 

    public ArrayList<News> getNews() {
        return listNews;
    }
    
    public void checkNews() {
        listNews.forEach((news) -> {
            fuzzification.checkEmotion(news.getEmotion());
        });
        listNews.forEach((news) -> {
            fuzzification.checkProvocation(news.getProvocation());
        });
    }
    
    public void convertNews() {
        fuzzification.convertEmotion(listNews);
        fuzzification.convertProvocation(listNews);
    }
    
    public void compareNews() {
        listNews.forEach((news) -> {
            inference.compareNews(news);
        });
    }
    
    public void compareTemp(News n) {
        
    }
    
}
