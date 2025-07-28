package Patika_3_Week.Film;

// Film sınıfı film adı, yıl, tür ve IMDB puanı içerir
public class Film {
    private final String name;
    private final int year;
    private final String genre;
    private final double imdbRating;

    // Yapıcı metot ( constructor )

    public Film(String name, int year, String genre, double imdbRating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.imdbRating = imdbRating;
    }

    // Getter metotlar (verilere erişmek için)


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public String getGenre() {
        return genre;
    }

    // Film bilgilerini ekrana yazdırmak için toString metodu

    @Override
    public String toString() {
        return name + " ( " + year + " ) " + genre + " - IMDB: " + imdbRating;
    }
}
