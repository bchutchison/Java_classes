import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowersCollection;

    public Borrower() {
        this.borrowersCollection = new ArrayList<Book>();
    }

    public int getNumberOfBooks() {
        return this.borrowersCollection.size();
    }

    public void takeBookToBorrow(Library library) {
        Book book = library.removeBookFromLibrary();
        this.borrowersCollection.add(book);
    }

    //single responsilbity ensures that one of the classes are responsible for actions.
}
