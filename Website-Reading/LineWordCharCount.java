import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class LineWordCharCount {
     
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("https://www.gutenberg.org/files/61132/61132-0.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            boolean print = false;
            int numline = 0;
            int numword = 0;
            int numchar = 0;
            int lineL = 0;
            String bank[] = {"a","b","c","d","e","f","g","h","i",
                "j","k","l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z","1","2","3","4","5","6","7",
                "8","9","0"," "};

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
                    System.out.println(line);

                    numline ++;                    
                    
                    if (lineL != 0){
                        //Word Count
                        numword++;
                        for (int a = 0 ; a < lineL-1; a++){
                            if (line.substring(a, a+1).equals(" ")){
                                numword++;
                            }
                        }
                        
                        //Character Count
                        for (int b = 0; b < lineL; b++){
                            String character = line.substring(b,b+1);
                            numchar++;
                            for (int c = 0; c < bank.length; c++){
                                if (character.toLowerCase().equals(bank[c])){
                                    numchar--;
                                }
                            }
                        }
                        
                    }
                }
            }
            in.close();
            System.out.println(numline + " lines");
            System.out.println(numword + " words");
            System.out.println(numchar + " characters that are not numbers, letters, or spaces");
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
         
    }
 
}
