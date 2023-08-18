package librarymanagementsytem;

public class Main {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(1001,"Harry Potter","J K Rowling");
        LibraryItem item2 = new Book(1001,"13 Reasons Why","Jay Asher");
        LibraryItem item3 = new DVD(1003,"Harry Potter",2);
        LibraryItem item4 = new DVD(1004,"Percy Jackson",3);
        LibraryMember student = new StudentMember(2002,"Nagul");
        student.reserveItem(item1);
        student.borrowItem(item4);
        LibraryMember faculty = new FacultyMember(2003,"Ethan");
        faculty.borrowItem(item3);
        faculty.reserveItem(item2);

    }
}
