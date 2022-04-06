public class MediaLib
{
    
    public static void main ()
    { 
        System.out.println("Welcome to your Media Library");
                        System.out.println();

        //Song
        System.out.println("Song");
        Song song1 = new Song();
        song1.setTitle("Jonny B. Goode");
        System.out.println(song1.getTitle());
        song1.setRating(1);
        System.out.println("Rating: " + song1.getRating());
        song1.setLength(3.5);
        System.out.println("Minutes: " + song1.getLength());
        song1.setPrice(5.00);
        System.out.println("Price: " + song1.getPrice());
                        System.out.println();

                        
        

        MediaFile.writeString(song1.getSong());
        MediaFile.saveAndClose();
                        
        Song song2 = new Song("One", 34.53, 1);
        System.out.println(song2.getSong());
        MediaFile.writeString(song2.getSong());
        Song song3 = new Song("Kaptop Song", 2.89, 5);
        System.out.println(song3.getSong());
        MediaFile.writeString(song3.getSong());
        Song song4 = new Song("Goodness", 2.85, 9);
        System.out.println(song4.getSong());
        MediaFile.writeString(song4.getSong());
        Song song5 = new Song("Sad Song", 2.09, 9);
        System.out.println(song5.getSong());
        MediaFile.writeString(song5.getSong());
        Song song6 = new Song("Despacito", 1.29, 5);
        System.out.println(song6.getSong());
        MediaFile.writeString(song6.getSong());
        MediaFile.saveAndClose();
        Song song7 = new Song("twerwer", 2.42, 7);
        System.out.println(song7.getSong());
        MediaFile.writeString(song7.getSong());
        MediaFile.saveAndClose();
        
        
        System.out.println();
        double totalCostS = 51.07;
        int numSongs = 7;
        int totalRatingS = 37;
        //Average Cost Songs
        double avgCostS = totalCostS/numSongs;
        System.out.println("Average Cost: " + avgCostS);
        //Average Rating Songs
        double avgRatingS = totalRatingS/numSongs;
        System.out.println("Average Rating: " + avgRatingS);
        
                System.out.println();
                System.out.println();

        //Book
        System.out.println("Book");
        Book book1 = new Book();
        book1.setTitle("Life of Ethan");
        System.out.println(book1.getTitle());
        book1.setRating(4);
        System.out.println("Rating: " + book1.getRating());
        book1.setPgnumber(365);
        System.out.println("Number of Pages: " + book1.getPgnumber());
        book1.setPrice(4.65);
        System.out.println(book1.getPrice());
        MediaFile.writeString(book1.getBook());
        MediaFile.saveAndClose();
                        System.out.println();

        double totalCostB = 4.65;
        int numBook = 1;
        int totalRatingB = 4;
        //Average Cost Book
        double avgCostB = totalCostB/numBook;
        System.out.println("Average Cost: " + avgCostB);
        //Average Rating Book
        double avgRatingB = totalRatingB/numBook;
        System.out.println("Average Rating: " + avgRatingB);
                        System.out.println();

                System.out.println();

        
        //Movie
        System.out.println("Movie");
        Movie movie1 = new Movie();
        movie1.setTitle("Long Movie");
        System.out.println(movie1.getTitle());
        movie1.setRating(9);
        System.out.println("Rating: " + movie1.getRating());
        movie1.setRecommend(true);
        System.out.println("Worth Watching: " + movie1.getRecommend());
        movie1.setDuration(149);
        System.out.println(movie1.getDuration());
        movie1.setPrice(2.64);
        System.out.println(movie1.getPrice());
        MediaFile.writeString(movie1.getMovie());
        MediaFile.saveAndClose();
        double totalCostM = 2.64;
        int numMovie = 1;
        int totalRatingM = 9;
        //Average Cost Movie
        double avgCostM = totalCostM/numMovie;
        System.out.println("Average Cost: " + avgCostM);
        //Average Rating Movie
        double avgRatingM = totalRatingM/numMovie;
        System.out.println("Average Rating: " + avgRatingM);
        
        System.out.println();
        System.out.println();

        //Average Cost
        double avgCost = (avgCostS + avgCostB + avgCostM)/3;
        System.out.println("Average Overall Cost: " + avgCost);
        
        //Average Rating
        double avgRating = (avgRatingS + avgRatingB + avgRatingM)/3;
        System.out.println("Average Overall Rating: " + avgRating);
        
        MediaFile.writeString(song1.getSong());
        MediaFile.writeString(song2.getSong());
        MediaFile.writeString(song3.getSong());
        MediaFile.writeString(song4.getSong());
        MediaFile.writeString(song5.getSong());
        MediaFile.writeString(song6.getSong());
        MediaFile.writeString(song7.getSong());
        MediaFile.writeString(book1.getTitle()+"|"+book1.getRating()+"|"+book1.getPgnumber()+"|"+book1.getPrice());
        MediaFile.writeString(movie1.getTitle()+"|"+movie1.getRating()+"|"+movie1.getRecommend()+"|"+movie1.getDuration()+"|"+movie1.getPrice());
        MediaFile.saveAndClose();
    }
}