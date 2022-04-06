/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public static void main (){
        
        String[] sharingFriends = {"Ethan",
                                   "Andrea",
                                   //"Jaiden",
                                   "Rohan",
                                   "Noah"};
        
        for (int i = 0; i < sharingFriends.length; i++){
            
            System.out.println(sharingFriends[i]);
            
        }
        int[] dayBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int avg : dayBtwnPurchase)
        {
            total += avg;
        }
        System.out.println(total/dayBtwnPurchase.length);
        
        Song[] topTenSongs = {new Song("a"),new Song("b"),new Song("c"),new Song("d"),new Song("E"),
            new Song("f"),new Song("g"),new Song("h"),new Song("i"),new Song("j")};
        for (Song s: topTenSongs)
        {
         System.out.println(s.getTitle());   
        }
        for (Song changeSong : topTenSongs){
            changeSong= new Song("test");
            System.out.println(changeSong.getTitle());
        }
        for (Song showSong : topTenSongs)
        {
            System.out.println(showSong.getTitle());
        }
        int i = 0;
        for (Song changeSong : topTenSongs)
        {
         changeSong.setPrice (1.29); 
         if (i%3 == 0)
         {
             
            }
        }
    }
}
