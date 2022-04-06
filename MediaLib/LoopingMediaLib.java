
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
   public static void main()
   {

       String txt = MediaFile.readString();
       while (txt != null){
        System.out.println(txt);
        txt = MediaFile.readString();

    }

       /**for (int x = 15; x>0; x--){
        System.out.println(MediaFile.readString());
    }*/
    //String songInfo = MediaFile.readString();
    
}
}
