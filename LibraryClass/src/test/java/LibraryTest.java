import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library smallLibrary;
    Book book;


    @Before
    public void Library() {
        library = new Library(100);
        smallLibrary = new Library(2);
        book = new Book("Book1", "Book1Author", "Novel");
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void hasNumberOfBooksInLibraryStock() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void addBookToLibraryStock() {
        library.addBookToStock(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void doesNotAddBookToLibraryStock() {
        smallLibrary.addBookToStock(book);
        smallLibrary.addBookToStock(book);
        smallLibrary.addBookToStock(book);
        assertEquals(2, smallLibrary.getNumberOfBooks());
    }

    @Test
    public void canRemoveBook() {
        library.addBookToStock(book);
        library.removeBookFromLibrary();
        assertEquals(0, library.getNumberOfBooks());
    }




}
