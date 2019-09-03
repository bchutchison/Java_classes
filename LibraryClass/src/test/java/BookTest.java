import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void Book() {
        book = new Book("Grapes Of Wrath", "Steinbeck", "Novel");
    }

    @Test
    public void hasTitle() {
        assertEquals("Grapes Of Wrath", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Steinbeck", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Novel", book.getGenre());
    }


}
