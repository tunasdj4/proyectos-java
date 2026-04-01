public class Romance extends Books {

    public Romance(String title, String author){
        super(title, author);
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Genre: Romance");
    }


}
