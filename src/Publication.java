import java.util.Scanner;

public class Publication implements Searchable {
    private String title;
    private String author;
    private Integer year;
    private Genre genre;
    Scanner au = new Scanner(System.in);








    Publication(String ttl, String auth, Integer ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.year = ye;
        this.genre = gnr;
    }
    Publication(){
        title = au.nextLine();
        author = au.nextLine();
        year = au.nextInt();
        genre = Genre.valueOf(au.nextLine().toUpperCase());
    }

    public void SetBook(String ttl, String auth, Integer ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.year = ye;
        this.genre = gnr;
    }

    public Publication returnBook(){
        return this;
    }

    public String toString(){
        return this.toString();
    }

    public String returnAuthor(){return author;}
    public Integer returnYear(){return year;}
    public String returnTitle(){return title;}
    public String returnGenre(){return genre.name().toString();}

    @Override
    public boolean matches(String query) {
        if(author == query || title == query)
            return true;
        return false;
    }

    public String getTitle() {
        return this.title;
    }
    public Integer getDate(){return year;}
}
