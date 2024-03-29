public class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean available;
    
    public Book(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getISBN()
    {
        return ISBN;
    }
    
    public boolean isAvailable()
    {
        return available;
    }
    
    public void lendBook()
    {
        available = false;
    }
    
    public void returnBook()
    {
        available = true;
    }
}