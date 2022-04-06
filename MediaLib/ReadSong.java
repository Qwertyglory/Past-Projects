
/**
 * Write a description of class ReadSong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadSong
{
    public static void main()
   {
    
       
       int totalSong = 0;
       int totalWord = 0;
       int numWrdBig = 0;
       String mostWord = "";
       int numWrdSmall = 1000000000;
       String leastWord = "";
       int longname = 0;
       String artistname = "";
       String artist1 = "";
       
    
    String txt = MediaFile.readString();
    while (txt != null){
        String title = txt;
        
        txt = MediaFile.readString();
        String artist = txt;
        if (artist.length() > longname){
            longname = txt.length();
            artistname = artist;
        }
        if (artist == artist1){
            artist.equals(artist1);
        }
        else if (artist == artist1){
         artist = "";
        }
        txt = MediaFile.readString();
        int year = Integer.parseInt(txt);
        
        
                                                                 
        txt = MediaFile.readString();
        int numWrd = Integer.parseInt(txt);
        if (numWrd > numWrdBig){
            numWrdBig = numWrd ;
            mostWord = title;
        }
        if (numWrd < numWrdSmall){
            numWrdSmall = numWrd;
            leastWord = title;
        }
        totalSong ++;
        totalWord = totalWord + numWrd;
        
        txt = MediaFile.readString();

    }

    int avgword = totalWord/totalSong;
    System.out.println("Total Number of Songs: " + totalSong);
    System.out.println("Average Number of Words: " + avgword);
    System.out.println("Song With the Most Words: " + mostWord);
    System.out.println("Song With the Least Words: " + leastWord);
    System.out.println("Artist With the Longest Name: " + artistname);
    
}
}
