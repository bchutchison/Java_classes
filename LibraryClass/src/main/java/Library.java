import java.util.ArrayList;

public class Library {

private ArrayList<Book> libraryStock;
private int capacity;


public Library (int capacity) {
    this.capacity = capacity;
    this.libraryStock = new ArrayList<Book>();
}

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfBooks() {
        return this.libraryStock.size();
    }

    public void addBookToStock(Book book) {
        if (this.libraryStock.size() < this.capacity) {
            this.libraryStock.add(book);
        }
    }


    public Book removeBookFromLibrary() {
        return this.libraryStock.remove(0); //how to use an if statement, which demands an else return of a book
    }

}
