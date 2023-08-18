package librarymanagementsytem;

public class Book extends LibraryItem{
    private String author;

    Book(int itemId,String title,String author){
        super.setTitle(title);
        super.setItemId(itemId);
        this.author=author;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    void displayInfo() {
        System.out.println( "Book title" + getTitle() + "\n Author Name : " + author);
    }
}
