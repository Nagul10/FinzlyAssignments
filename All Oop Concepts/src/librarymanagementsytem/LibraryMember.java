package librarymanagementsytem;

public abstract class LibraryMember implements Reservable{
    private int memberID;
    private String name;

    abstract void borrowItem(LibraryItem libraryItem);

}
