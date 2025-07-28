package Patika_3_Week.Film;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmManager {
    public static void main(String[] args) {

        // 5 Film nesnesi oluşturuluyor
        List<Film> films = new ArrayList<>();
        films.add(new Film(" Inception ", 2010, " Sci-Fi ", 8.8));
        films.add(new Film(" The Godfather ", 1972, " Crime ", 9.2));
        films.add(new Film(" Interstellar ", 2014, " Sci-Fi ", 8.6));
        films.add(new Film(" Parasite ", 2019, " Thriller ", 8.6));
        films.add(new Film(" Forrest Gump ", 1994, " Drama ", 8.8));


        // IMDB puanına göre büyükten küçüğe sıralama
        System.out.println(" IMDB'ye göre sıralama ( büyükten küçüğe): ");
        films.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRating).reversed())
                .forEach(System.out::println);

        System.out.println("\nYayın yılına göre sıralama (küçükten büyüğe):");
        films.stream()
                .sorted(Comparator.comparingInt(Film::getYear))
                .forEach(System.out::println);


        // Belirli bir türdeki filmleri filtrele
        System.out.println("\n'Sci-Fi' türündeki filmler: ");
        filterBygenre(films, " Sci-Fi ");

        System.out.println("\n 'Drama' türündeki filmler: ");
        filterBygenre(films, " Drama ");
    }

    // Film türüne göre flitreleme yapan metot
    public static void filterBygenre(List<Film> films, String genre) {
        films.stream().filter(film -> film.getGenre().equalsIgnoreCase(genre)).forEach(System.out::println);
    }
}
