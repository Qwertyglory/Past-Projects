import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class PigLatin2 {
     
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("https://www.gutenberg.org/files/61132/61132-0.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            boolean print = false;
            int lineL = 0;
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
                    if (lineL == 0){
                        System.out.println(line);
                    }
                    String arr[] = line.split(" ");
                    if (lineL > 0){
                        for (String word : arr){
                            
                            if (word.length() == 1){
                                System.out.print(word);
                            }
                            int i = 0;
                            int countI = 0;
                            int l = word.length()-1;
                            int countL = 0;
                            if (word.length() > 1){
                                // determine the first letter [i] (excluding symbols)
                                while (countI == 0){    
                            
                                    char letter = word.charAt(i);
                                    int value = (int) letter;
                                    //if (!(value >= 65 && value <=90) || !(value >= 97 && value <= 92)){
                                    //    System.out.print(letter);
                                    //}
                                    if ((value >= 65 && value <=90) || (value >= 97 && value <= 122)){
                                        
                                        countI++; // for consonant
                                        if (value == 65 ||value == 69 ||value == 73 ||value == 79 ||value == 85 ||
                                            value == 97 ||value == 101 ||value == 105 ||value == 111 ||value == 116){
                                              countI++; // for vowel
                                        }
                                    }
                                    i++;
                                    if (i == word.length()){
                                        countI += 5; //no letters of the alphabet
                                    }
                                }
                                // determine last letter [l] (excluding symbols)
                                while (countL == 0){    
                                    
                                    char letterL = word.charAt(l);
                                    int valueL = (int) letterL;
                                    
                                    if ((valueL >= 65 && valueL <=90) || (valueL >= 97 && valueL <= 122)){
                                        
                                        countL--; // for any letter
                                        
                                    }
                                    l--;
                                    if (l == -1){
                                        countL += 5; //no letters of the alphabet
                                    }
                                }
                                
                                if (countI == 1 ){ // consonant
                                    //Beg Symbols
                                    if (i > 0){
                                        for (int z = 0; z < i - 1; z++){
                                            System.out.print(word.charAt(z));
                                        }
                                    }
                                    //Word
                                    for (int z = i; z <= l + 1; z++){
                                        System.out.print(word.charAt(z));
                                    }
                                    //Consonant + ay
                                    System.out.print(word.charAt(i-1) + "ay");
                                    //End Symbols
                                    if (l < word.length()){
                                        for (int z = l + 2; z < word.length()-1; z++){
                                            System.out.print(word.charAt(z));
                                        }
                                    }
                                    System.out.print(" ");
                                }
                                if (countI == 2){ // vowel
                                    //Beg Symbols
                                    if (i > 0){
                                        for (int z = 0; z < i - 1; z++){
                                            System.out.print(word.charAt(z));
                                        }
                                    }
                                    //Word and ay
                                    for (int z = i-1; z <= l + 1; z++){
                                        System.out.print(word.charAt(z));
                                    }
                                    System.out.print("ay");
                                    //End Symbols
                                    if (l < word.length()){
                                        for (int z = l + 2; z < word.length(); z++){
                                            System.out.print(word.charAt(z));
                                        }
                                    }
                                    System.out.print(" ");
                                }
                                
                            }
                            //System.out.print(" ");
                        }
                        System.out.println("");
                    }
                }
            }
        
    
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
