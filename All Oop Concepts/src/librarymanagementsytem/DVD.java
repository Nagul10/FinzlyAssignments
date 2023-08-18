package librarymanagementsytem;

public class DVD extends LibraryItem{
    private int duration;
    DVD(int itemId,String title,int duration){
        super.setTitle(title);
        super.setItemId(itemId);
        this.duration=duration;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    void displayInfo() {
        System.out.println("DVD title : "+ getTitle() + "\n Duration : "+ duration);
    }
}
