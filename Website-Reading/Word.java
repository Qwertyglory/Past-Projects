
/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word
{
    
    private String word;
    private int count;
    
    public Word (String c, int d){
        word = c;
        count = d;
    }
    
    public void setWord(String a){
        word = a;
    }
    public String getWord(){
        return word;
    }
    public void setCount(int b){
        count = b;
    }
    public int getCount(){
        return count;
    }
    
    
}
