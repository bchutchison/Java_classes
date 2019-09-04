import java.util.ArrayList;
import java.util.HashMap;

public class Library {

private ArrayList<Book> libraryStock;
private HashMap<String, Integer> stockByGenre;
private int capacity;


public Library (int capacity) {
    this.capacity = capacity;
    this.libraryStock = new ArrayList<Book>();
    this.stockByGenre = new HashMap();
}

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfBooks() {
        return this.libraryStock.size();
    }


    //create public boolean to specify if library has capacity and use in method below

    public void addBookToStock(Book book) {
        if (this.libraryStock.size() < this.capacity) {
            this.libraryStock.add(book);
//            this.stockByGenre.put(book.getGenre(), 1);
        }
    }

    public Book removeBookFromLibrary() {
        return this.libraryStock.remove(0); //how to use an if statement, which demands an else return of a book
    }

}
