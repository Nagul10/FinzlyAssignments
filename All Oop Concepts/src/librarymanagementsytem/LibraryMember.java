package librarymanagementsytem;

public abstract class LibraryMember implements Reservable{
    private int memberID;
    private String name;

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public LibraryMember(int memberID, String name) {
        this.memberID=memberID;
        this.name=name;
    }

    abstract void borrowItem(LibraryItem libraryItem);

}
