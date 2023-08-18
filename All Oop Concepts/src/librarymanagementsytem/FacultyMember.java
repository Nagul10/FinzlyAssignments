package librarymanagementsytem;

public class FacultyMember extends LibraryMember{
    @Override
    void borrowItem(LibraryItem libraryItem) {
        System.out.println(libraryItem.getTitle()+" Borrowed");
    }

    @Override
    public void reserveItem(LibraryItem libraryItem) {
        System.out.println(libraryItem.getTitle()+"Reserved");
    }
}
