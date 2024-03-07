import java.util.*;

public class Library
{   
    private ArrayList<Book> books;
    public Library()
    {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void lendBook(String ISBN)
    {
        for (Book book : books)
        {
            if (book.getISBN().equals(ISBN) && book.isAvailable())
            {
                book.lendBook();
                System.out.println("Book lent: " + book.getTitle());
                return;
            }
        }
    }

    public boolean checkBookAvailability(String ISBN)
    {
        for (Book book : books)
        {
            if (book.getISBN().equals(ISBN))
            {
                return book.isAvailable();
            }
        }
        return false;
    }

    public void displayAvailableBooks()
    {
        for (Book book : books)
        {
            if (book.isAvailable())
            {
                System.out.println(book.getTitle());
            }
        }
    }

    public void returnBook(String ISBN)
    {
        for (Book book : books)
        {
            if (book.getISBN().equals(ISBN))
            {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
    }
}