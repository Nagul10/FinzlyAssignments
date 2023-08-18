package librarymanagementsytem;

public class LibraryItem {
    private String title;
    private int itemId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    void displayInfo(){
        System.out.println("Library Item \n Title : " + title);
    }
}
