package librarymanagementsytem;

public class StudentMember extends LibraryMember{
    public StudentMember(int memberID, String name) {
        super(memberID,name);
    }

    @Override
    void borrowItem(LibraryItem libraryItem) {
        System.out.println(this.getMemberID()+ " "+this.getName());
        System.out.println(libraryItem.getTitle()+" "+libraryItem.getClass().getSimpleName()+" Borrowed");
    }

    @Override
    public void reserveItem(LibraryItem libraryItem) {
        System.out.println(this.getMemberID()+ " "+this.getName());
        System.out.println(libraryItem.getTitle()+" "+libraryItem.getClass().getSimpleName()+" Reserved");
    }
}
