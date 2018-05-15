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
public class News {
    private String newsId;
    private Emotion emotion;
    private Provocation provocation;
    private Hoax hoax;

    public News(String newsId, int crispEmotion, int crispProvocation) {
        this.newsId         = newsId;
        this.emotion        = new Emotion(crispEmotion);
        this.provocation    = new Provocation(crispProvocation);
        this.hoax           = new Hoax();
    }

    public String getNewsId() {
        return newsId;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public Provocation getProvocation() {
        return provocation;
    }

    public boolean isHoax() {
        return this.hoax.isTrue();
    }
    
    
    
}
