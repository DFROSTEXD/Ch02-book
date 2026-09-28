/**
 * Upgraded the book code to reflect the build in the exercises
 * on pages 90-92. These are exercises 2.83-2.92.
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
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        this.courseText = courseText;
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
        System.out.println("Borrowed: " + borrowed);
        
        if (refNumber.length() > 0)
        {
            System.out.println(refNumber);
        }
        else
        {
            System.out.println("ZZZ");
        }
    }
    
    /**
     * setRefNumber
     * @sets the refNumber
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
            {
            refNumber = ref;
            }
        else
        {
            System.out.println("Error");
        }
    }
    /**
     * getRefNumber
     * @gets the refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * borrowed incrementation
     * @increases the amount of times a book has been borrowed when using getBorrow
     */
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    /**
     * getBorrowed
     * @gets the borrowed amount
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * isCourseText
     * @sets a boolean that checks if the book is a textbook
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
