import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private List<Book> books = Stream.of(
            new Book("World and War","L.Tolstoy",1999,Genre.COMEDY),
            new Book("Man","Spielberg",2000,Genre.FICTION),
            new Book("Peoples", "Pushkin", 1898, Genre.HORROR)
    ).collect(Collectors.toList());
    private String title = "Library_one";

    public String addBook_first(Book book){
        if(!books.isEmpty()){
            for(Book b : books){
                if(book.getTitle() == b.getTitle()){
                    return "This book created late";
                }
            }
            books.add(book);
            return "book added";
        }
        books.add(book);
        return "Completed !";
    }

    public void addBook_second(){
        addBook_first(new Book());
    }

    public void removeBook(String title){
        if(!books.isEmpty()){
            for(Book b : books){
                if(b.getTitle() == title){
                    books.remove(b);
                }
            }
        }
    }

    public Book findBooks(String query){
        if(!books.isEmpty()){
            for(Book b : books){
                if(b.matches(query)){
                    return b;
                }
            }
            return null;
        }
        return null;
    }

    public List<Book> listBook(){
        return books;
    }

    public String searchByDate(Integer fromDate, Integer toDate){
        return resultByDate(new Iterator<Book>() {

            private ListIterator<Book> bkTo = books.listIterator();

            @Override
            public boolean hasNext() {
                return bkTo.hasNext();
            }

            @Override
            public Book next() {
                return bkTo.next();
            }
        }, fromDate, toDate).toString();
    }

    protected List<Book> resultByDate(Iterator<Book> it, Integer fDate, Integer tDate){
        if(!it.hasNext())
            return null;

        Book bokk = it.next();
        List<Book> bookList = resultByDate(it, fDate, tDate);

        if(bokk.getDate() > fDate && bokk.getDate() < tDate){
            bookList.add(0,bokk);
        }

        return bookList;
    }




}
