import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
 
public class ReadWebsite3 {
     
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("https://www.gutenberg.org/files/766/766-0.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            boolean print = false;
            int lineL = 0;
            List <Word> words = new ArrayList <Word> ();
            while ((line = in.readLine()) != null) {
                
                if (line.indexOf("*** START OF THIS PROJECT GUTENBERG") >= 0){
                    print = true;
                    continue;
                }
                else if (line.indexOf("End of the Project Gutenberg") >= 0){
                    print = false;
                }
                if (print){
                    lineL = line.length();
                    String arr[] = line.split(" ");
                    if (lineL > 0){
                        for (String word : arr){
                            String subject = word.toLowerCase();
                            
                            /////////////////////////////////////////////////////////////
                            //Cleaning
                            /////////////////////////////////////////////////////////////
                            int quote = subject.indexOf("\"");
                            while (quote != -1){
                                subject = subject.substring(0, quote) + subject.substring(quote +1);
                                quote = subject.indexOf("\"");
                            }
                            int underScore = subject.indexOf("_");
                            while (underScore != -1){
                                subject = subject.substring(0, underScore) + subject.substring(underScore +1);
                                underScore = subject.indexOf("_");
                            }
                            int period = subject.indexOf(".");
                            while (period != -1){
                                subject = subject.substring(0, period) + subject.substring(period +1);
                                period = subject.indexOf(".");
                            }
                            int colon = subject.indexOf(":");
                            while (colon != -1){
                                subject = subject.substring(0, colon) + subject.substring(colon +1);
                                colon = subject.indexOf(":");
                            }
                            int exclamation = subject.indexOf("!");
                            while (exclamation != -1){
                                subject = subject.substring(0, exclamation) + subject.substring(exclamation +1);
                                exclamation = subject.indexOf("!");
                            }
                            int question = subject.indexOf("?");
                            while (question != -1){
                                subject = subject.substring(0, question) + subject.substring(question +1);
                                question = subject.indexOf("?");
                            }
                            int dash = subject.indexOf("-");
                            while (dash != -1){
                                subject = subject.substring(0, dash) + subject.substring(dash +1);
                                dash = subject.indexOf("-");
                            }
                            int star = subject.indexOf("*");
                            while (star != -1){
                                subject = subject.substring(0, star) + subject.substring(star +1);
                                star = subject.indexOf("*");
                            }
                            int bracketR = subject.indexOf("]");
                            while (bracketR != -1){
                                subject = subject.substring(0, bracketR) + subject.substring(bracketR +1);
                                bracketR = subject.indexOf("]");
                            }
                            int bracketL = subject.indexOf("[");
                            while (bracketL != -1){
                                subject = subject.substring(0, bracketL) + subject.substring(bracketL +1);
                                bracketL = subject.indexOf("[");
                            }
                            int comma = subject.indexOf(",");
                            while (comma != -1){
                                subject = subject.substring(0, comma) + subject.substring(comma +1);
                                comma = subject.indexOf(",");
                            }
                            int parenthL = subject.indexOf("(");
                            while (parenthL != -1){
                                subject = subject.substring(0, parenthL) + subject.substring(parenthL +1);
                                parenthL = subject.indexOf("(");
                            }
                            int parenthR = subject.indexOf(")");
                            while (parenthR != -1){
                                subject = subject.substring(0, parenthR) + subject.substring(parenthR +1);
                                parenthR = subject.indexOf(")");
                            }
                            int hashtag = subject.indexOf("#");
                            while (hashtag != -1){
                                subject = subject.substring(0, hashtag) + subject.substring(hashtag +1);
                                hashtag = subject.indexOf("#");
                            }
                            int equal = subject.indexOf("=");
                            while (equal != -1){
                                subject = subject.substring(0, equal) + subject.substring(equal +1);
                                equal = subject.indexOf("=");
                            }
                            int slashB = subject.indexOf("\\");
                            while (slashB != -1){
                                subject = subject.substring(0, dash) + subject.substring(dash +1);
                                slashB = subject.indexOf("-");
                            }
                            int dash2 = subject.indexOf("—");
                            while (dash2 != -1){
                                subject = subject.substring(0, dash2) + subject.substring(dash2 +1);
                                dash2 = subject.indexOf("—");
                            }
                            int semi = subject.indexOf(";");
                            while (semi != -1){
                                subject = subject.substring(0, semi) + subject.substring(semi +1);
                                semi = subject.indexOf(";");
                            }
                            String actual = subject;
                            //System.out.print(actual + " ");
                            //////////////////////////////////////////////////////////////
                            //Array List Stuff
                            //////////////////////////////////////////////////////////////
                            
                            boolean noMatch = true;
                            for (int e = 0; e < words.size(); e++){
                                if (words.get(e).getWord().equals(actual)){
                                    int original = words.get(e).getCount();
                                    words.get(e).setCount(original + 1);
                                    noMatch = false;
                                    //for (int qw = 0; e-qw > 0; qw++){
                                        //if(words.get(e-qw).getCount() <= words.get(e-qw-1).getCount()){
                                        if (e != 0){
                                            if (words.get(e).getCount() >= words.get(e-1).getCount()){
                                                Word first = words.get(e);
                                                Word second = words.get(e-1);
                                                words.set(e-1, first);
                                                words.set(e, second);
                                            }   
                                        }
                                        //}
                                    //}
                                    
                                }
                            }
                            if (noMatch) {
                                words.add(new Word(subject, 1));
                            }
                            
                        }
                        //System.out.println("");
                        
                        
                    }
                }
            }
            
            
            
            // for (int qw = 0; qw < words.size()-1; qw++){
                // while (words.get(qw).getCount() <= words.get(qw+1).getCount()){
                    // int c = 0;
                    // while (qw+c < words.size()-1){
                        
                        
                            // if (words.get(qw+c).getCount() <= words.get(qw+c+1).getCount()){
                                // Word first = words.get(qw+c);
                                // Word second = words.get(qw+c+1);
                                // words.set(qw+c+1, first);
                                // words.set(qw+c, second);
                            // }
                        
                        // c++;
                    // }
                // }
                // System.out.println(words.get(qw).getWord() + "|" + words.get(qw).getCount());
            // }
            
            // Sort in order from front
            // for (int ab = 0; ab < words.size()-1; ab++){
                
                // if (words.get(ab).getCount() <= words.get(ab+1).getCount()){
                    // Word first = words.get(ab);
                    // Word second = words.get(ab+1);
                    // words.set(ab+1, first);
                    // words.set(ab, second);
                    
                // }
                   
            // }
            // for (int ab = words.size()-1; ab > 0; ab--){
                
                // if (words.get(ab).getCount() >= words.get(ab-1).getCount()){
                    // Word first = words.get(ab);
                    // Word second = words.get(ab-1);
                    // words.set(ab-1, first);
                    // words.set(ab, second);
                    
                // }
                   
            // }
            
            
            
            System.out.print("Top ");
            String number = UserInput.getString();
            int actual = 0;
            for (int o = 0; o < number.length(); o++){
                char num = number.charAt(o);
                int value = (int) num;
                
                if (value == 48){
                    actual += 0;
                }
                if (value == 49){
                    actual = actual + (1*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 50){
                    actual = actual + (2*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 51){
                    actual = actual + (3*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 52){
                    actual = actual + (4*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 53){
                    actual = actual + (5*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 54){
                    actual = actual + (6*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 55){
                    actual = actual + (7*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 56){
                    actual = actual + (8*((int)Math.pow(10, number.length()-o-1)));
                }
                if (value == 57){
                    actual = actual + (9*((int)Math.pow(10, number.length()-o-1)));
                }
                
            }
            
            //print the info
            int num = 1;
            for (int aa = 0; aa < actual; aa++){
                System.out.println("#" + num + ":" + words.get(aa).getWord() + "|" + words.get(aa).getCount());
                num++;
            }
            boolean qwerty = true;
            System.out.print(qwerty);
        
    
            in.close();
            
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
         
    }
 
}
