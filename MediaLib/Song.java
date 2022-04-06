
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    private int rating;
    private String title;
    private double length;
    private double price;
    private boolean favorite;
    
    public Song(){
        rating = 0;
        title = "";
        price = 0.00;
        favorite = true;
        length = 0.00;
    }
    
    public void addToFavorites(){
        favorite = true;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double cost){
        price = cost;
    }
    public String getTitle(){
        return "Title: " + title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rate){
        rating = rate;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double time){
        length = time;
    }
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
      
    }
    public Song(String title)
    {
        this.title = title;
        
      
    }
    public String getSong(){
        String name = getTitle();
    String good = "Rating: " + getRating();
    String money = "Price: " + getPrice();
    
        return name +"|" +good+ "|"+ money;
    
    }
}
