
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private double rating;
    private String title;
    private boolean recommend;
    private int duration;
    private double price;
    
    public Movie()
    {
        rating = 0;
        title = "";
    }
     public String getTitle(){
        return "Title: " + title;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double cost){
        price = cost;
    }
    public void setTitle(String t) {
        title = t;
    }
    public String getRating(){
        return "Rating: " + rating;
    }
    public void setRating(double rate){
        rating = rate;
    }
    public boolean getRecommend(){
        return recommend;
    }
    public void setRecommend(boolean rcmnd){
        recommend = rcmnd;
    }
    public String getDuration(){
        int hour = duration/60;
        int minute = duration%60;
        return hour + " hour " + minute + " minutes ";
    }
    public void setDuration(int time){
        duration = time;
    }
    public String getMovie(){
        String name = getTitle();
    String good = "Rating: " + getRating();
    String money = "Price: " + getPrice();
    
        return name +"|" +good+ "|"+ money;
    
    }
}
