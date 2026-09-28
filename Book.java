/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (William Harvey)
 * @version (9/28/26)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    
    /**
     * getAuthor
     * @returns name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * getTitle
     * @returns name of the book title
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * getPages
     * @returns the number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * printAuthor and printTitle
     * @prints both the author and title in the terminal
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * printDetails
     * @prints out all the information
     */
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
    
    /**
     * setRefNumber
     * @sets the refNumber
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    /**
     * getRefNumber
     * @gets the refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
}
