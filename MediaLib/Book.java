
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private double rating;
    private String title;
    private int pgnumber;
    private double price;
    
    public Book()
    {
        rating = 0;
        title = "";
    }
     public String getTitle(){
        return "Title: " + title;
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
    public int getPgnumber(){
        return pgnumber;
    }
    public void setPgnumber(int number){
        pgnumber = number;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double cost){
        price = cost;
    }
    public String getBook(){
        String name = getTitle();
    String good = "Rating: " + getRating();
    String money = "Price: " + getPrice();
    
        return name +"|" +good+ "|"+ money;
    
    }
}
