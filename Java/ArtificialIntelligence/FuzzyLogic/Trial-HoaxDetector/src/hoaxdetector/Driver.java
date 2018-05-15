/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaxdetector;

/**
 *
 * @author ghost
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaxDetector detector = new HoaxDetector();
        
        detector.addNews(new News("B01", 97, 74));
        detector.addNews(new News("B02", 36, 85));
        detector.addNews(new News("B03", 63, 43));
        detector.addNews(new News("B04", 82, 90));
        detector.addNews(new News("B05", 71, 25));
        detector.addNews(new News("B06", 79, 81));
        detector.addNews(new News("B07", 55, 62));
        detector.addNews(new News("B08", 57, 45));
        detector.addNews(new News("B09", 40, 65));
        detector.addNews(new News("B10", 57, 45));
        detector.addNews(new News("B11", 77, 70));
//        detector.addNews(new News("B12", 68, 75));
//        detector.addNews(new News("B13", 60, 70));
//        detector.addNews(new News("B14", 82, 90));
//        detector.addNews(new News("B15", 40, 85)); 
//        detector.addNews(new News("B16", 80, 68));
//        detector.addNews(new News("B17", 60, 72));
//        detector.addNews(new News("B18", 50, 95));
//        detector.addNews(new News("B19", 100, 18));
//        detector.addNews(new News("B20", 11, 99)); 
//        detector.addNews(new News("B21", 58, 63));
//        detector.addNews(new News("B22", 68, 70));
//        detector.addNews(new News("B23", 64, 66));
//        detector.addNews(new News("B24", 57, 77));
//        detector.addNews(new News("B25", 77, 55));
//        detector.addNews(new News("B26", 98, 64));
//        detector.addNews(new News("B27", 91, 59));
//        detector.addNews(new News("B28", 50, 95));
//        detector.addNews(new News("B29", 95, 55));
//        detector.addNews(new News("B30", 27, 79));
        
        detector.checkNews();
        detector.convertNews();
        detector.compareNews();
        
        
        for (News news : detector.getNews()) {
            System.out.println(news.getNewsId() + " - " + 
                    news.getEmotion().getCrispEmotion() + " - " + 
                    news.getProvocation().getCrispProvocation() + " - " +
                    news.getEmotion().isLow() + " - " + news.getEmotion().isModerate() + " - " + news.getEmotion().isHigh() + " | " + 
                    news.getEmotion().getFuzzyLow()+ " - " + news.getEmotion().getFuzzyModerate() + " - " + news.getEmotion().getFuzzyHigh() + " | " +
                    news.getProvocation().isLow() + " - " + news.getProvocation().isModerate() + " - " + news.getProvocation().isHigh() + " | " + 
                    news.getProvocation().getFuzzyLow()+ " - " + news.getProvocation().getFuzzyModerate() + " - " + news.getProvocation().getFuzzyHigh() + " | " );
            
        }
    }
    
}
