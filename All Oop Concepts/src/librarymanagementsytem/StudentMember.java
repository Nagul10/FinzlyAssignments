package librarymanagementsytem;

public class StudentMember extends LibraryMember{
    @Override
    void borrowItem(LibraryItem libraryItem) {
        System.out.println(libraryItem.getTitle()+" "+libraryItem.getClass().getSimpleName()+" Borrowed");
    }

    @Override
    public void reserveItem(LibraryItem libraryItem) {
        System.out.println(libraryItem.getTitle()+" "+libraryItem.getClass().getSimpleName()+" Reserved");
    }
}
