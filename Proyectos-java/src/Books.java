public class Books {
    private String title;
    private String author;
    private boolean borrowed = false;

    public Books(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setBorrowed(boolean status){
        this. borrowed = status;
        if(status){
            System.out.println("The Book " + getTitle() + " Has borrowed");
        }else {
            System.out.println("The Book " + getTitle() + " Has returned");
        }
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void printDetails(){
        String status = borrowed ? "Borrowed" : "Available";
        System.out.println("Status: " + status + " Title: " + getTitle() + " Author: " + getAuthor());
    }
}
