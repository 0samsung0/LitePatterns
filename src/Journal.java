import java.util.Scanner;

public class Journal implements Searchable, ScannerInterface{
    private String title;
    private String author;
    private String publisher;
    private Genre genre;
    private String link;
    Scanner scan;







    Journal(String ttl, String auth, String ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.publisher = ye;
        this.genre = gnr;
        this.scan = ScannerInterface.scan();
        // добавить абстр.класс и там реализовать field(super.scan = ScannerInterface)
    }
    Journal(){
        title = au.nextLine();
        author = au.nextLine();
        publisher = au.nextLine();
        genre = Genre.valueOf(au.nextLine().toUpperCase());
        scan = ScannerInterface.scan();
    }

    public void SetBook(String ttl, String auth, String ye, Genre gnr){
        this.author = auth;
        this.title = ttl;
        this.publisher = ye;
        this.genre = gnr;
    }

    public Journal returnBook(){
        return this;
    }

    public String toString(){
        return this.toString();
    }

    public String returnAuthor(){return author;}
    public String returnPublisher(){return publisher;}
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
    public String getPublisher(){return publisher;}
}


