import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WordFailed
{
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("https://www.gutenberg.org/files/61132/61132-0.txt");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            boolean print = false;
            
            String all1[] = null;
            

            while ((line = in.readLine()) != null) {
                
                if (line.indexOf("*** START OF THIS PROJECT GUTENBERG") >= 0){
                    print = true;
                    continue;
                }
                else if (line.indexOf("End of the Project Gutenberg") >= 0){
                    print = false;
                }
                if (print){
                    System.out.println(line);
                    String arr[] = line.split(" ");
                    
                    if (line.length() > 0){
                        for (String word : arr){
                            
                            //word without symbols
                            String a = "";
                            for (int i = 0; i < word.length(); i++){
                                char letter = word.charAt(i);
                                int value = (int) letter;
                                if ((value >= 65 && value <=90) || (value >= 97 && value <= 122)){
                                    a += letter;
                                }
                            }
                            for (int b = 0; b < all1.length; b++){
                                if (!all1[b].equals(a)){
                                    String all2[] = new String[all1.length + 1];
                                    for (int z = 0; z < all1.length; z++){
                                        all2[z] = all1[z];
                                    }
                                    all2[all1.length] = a;
                                }
                            }
                        }
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
