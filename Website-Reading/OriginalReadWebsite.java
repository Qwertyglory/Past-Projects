import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class OriginalReadWebsite {
     
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
            String consonant[] = {"b","c","d","f","g","h",
                "j","k","l","m","n","p","q","r","s","t",
                "v","w","x","y","z"};
            String vowel[] = {"a","e","i","o","u"};
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
                    

                    // if (lineL == 0){
                        // System.out.println(line);
                    // }
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
                        
                        //Pig Latin
                        int wordL = 0;
                        for (int h = 0; h < lineL; h++){
                            wordL ++;
                            if (line.substring(h, h+1).equals(" ")){
                                if (wordL == 1){
                                    System.out.print(line.substring(h-1,h));
                                }
                                if (wordL > 1){
                                    for (int i = 0; i < consonant.length; i++){
                                        if (line.substring(h-wordL, h+1-wordL).toLowerCase().equals(consonant[i])){
                                            for (int j = 1; j < wordL; j++){
                                                System.out.print(line.substring(h-wordL+j));
                                            }
                                            System.out.print(line.substring(h-wordL, h+1-wordL) + "ay");
                                        }
                                    }
                                    for (int i = 0; i < vowel.length; i++){
                                        if (line.substring(h-wordL, h+1-wordL).toLowerCase().equals(vowel[i])){
                                            for (int j = 0; j < wordL; j++){
                                                System.out.print(line.substring(h-wordL+j));
                                            }
                                            System.out.print("ay");
                                        }
                                    }
                                }
                                wordL = 0;
                                // for (int l = line.length()-1; l == 0; l --){
                                    
                                // }
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