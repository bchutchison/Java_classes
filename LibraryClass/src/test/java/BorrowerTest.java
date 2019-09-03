import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void Borrower() {
        borrower = new Borrower();
        library = new Library(100);
        library.addBookToStock(book);
        book = new Book("Book1", "Book1Author", "Novel");
    }

    @Test
    public void hasNumberOfBooksInCollection() {
        assertEquals(0, borrower.getNumberOfBooks());
    }

    @Test
    public void borrowBook() {
        borrower.takeBookToBorrow(library);
        assertEquals(1, borrower.getNumberOfBooks());
    }


}
