import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Lists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lists
{
    public static void main (String [] args){
        List <Integer> numbers = new ArrayList <Integer> ();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        for (int i = 0; i < 3; i++){
            System.out.println(numbers.get(i));
        }
        
    }
}
