import java.util.Scanner;

public class Journal implements Searchable{
    private String title;
    private String author;
    private String publisher;
    private Genre genre;
    Scanner au = new Scanner(System.in);








    Journal(String ttl, String auth, String ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.publisher = ye;
        this.genre = gnr;
    }
    Journal(){
        title = au.nextLine();
        author = au.nextLine();
        publisher = au.nextLine();
        genre = Genre.valueOf(au.nextLine().toUpperCase());
    }

    public void SetBook(String ttl, String auth, String ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.year = ye;
        this.genre = gnr;
    }

    public Journal returnBook(){
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


