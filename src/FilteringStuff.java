import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Movie{
   // abstract int t ;
    static enum Genre  {DRAMA, THRILLER, HORROR, ACTION };
    private Genre genre;

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre=" + genre +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", time=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getTime() {
        return time;
    }

    public char getRating() {
        return rating;
    }

    private String name;
    private char rating = 'R';
    private Integer time;
    Movie(String name, Genre genre, char rating, int time)
    {         this.name = name; this.genre = genre; this.rating = rating;this.time=time;
    }
 }
 public class FilteringStuff
 {
     public static void main(String[] args)
     {


         var movies = Arrays.asList(
                 new Movie("Titanic", Movie.Genre.DRAMA, 'U',120),
                 new Movie("Psycho", Movie.Genre.THRILLER, 'U',130),
                 new Movie("Oldboy", Movie.Genre.THRILLER, 'R',140),
                 new Movie("Shining", Movie.Genre.HORROR, 'U',150)  ,
                 new Movie("Tit", Movie.Genre.DRAMA, 'U',160),
                 new Movie("Psy", Movie.Genre.THRILLER, 'U',170),
                 new Movie("Old", Movie.Genre.THRILLER, 'R',180),
                 new Movie("Shi", Movie.Genre.HORROR, 'U',190)  ,
                 new Movie("T", Movie.Genre.DRAMA, 'A',200),
                 new Movie("P", Movie.Genre.THRILLER, 'A',125),
                 new Movie("O", Movie.Genre.THRILLER, 'A',135),
                 new Movie("S", Movie.Genre.HORROR, 'A',145)
                 );
        var y= movies.stream().collect(Collectors.partitioningBy(movie -> movie.getRating()=='A',Collectors.mapping(m->m.getName(),Collectors.toList())));
        var z=movies.stream().count();
        var a=movies.stream().collect(Collectors.groupingBy(movie -> movie.getGenre(),Collectors.mapping(m->m.getName(),Collectors.toList())));
         System.out.println(y);
         System.out.println(z);
         System.out.println(a);
         var b=movies.stream().collect(Collectors.averagingInt(movie->movie.getTime()));
         System.out.println(b);
         var c=movies.stream().collect(Collectors.collectingAndThen(Collectors.toList(),list->list.stream().map(movie->movie.getName()).map(String::toUpperCase).toList()));
         System.out.println(c);
         IntStream is1 = IntStream.range(1, 3);
         IntStream is2 = IntStream.rangeClosed(1, 3);
         IntStream is3 = IntStream.concat(is1, is2);
         var bh=is3.boxed().collect(Collectors.groupingBy(k->k));
         System.out.println(bh);
         //Object val = is3.boxed().collect(Collectors.groupingBy(k->k)).get(3); System.out.println(val);
         int[][] ia={ {1, 2}, null };
         //System.out.println(ia[1][0]);
         String[ ] sa = new String[ ]{ "a", "b", "c"};
         var sa1 = new String[ ]{"a", "b", "c"};
         String  sa2[] = {"a", "b", "c"};
         List<String> vowels = new ArrayList<>(); vowels.add("a"); vowels.add("e"); vowels.add("i"); vowels.add("o"); vowels.add("u");
         Function<List<String>, List<String>> f = list->list.subList(2, 4);
         var vb=f.apply(vowels);
         System.out.println(vb);
         //byte x=;


     }
//     void test(byte x){
//         switch(x){
//             case 'a':   // 1
//             case 256:   // 2
//             case 0:     // 3
//             default :   // 4
//             case 80:    // 5
//         }
//     }
 }
