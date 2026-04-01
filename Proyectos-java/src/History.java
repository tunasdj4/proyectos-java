public class History extends Books{

    public History(String title, String author){
        super(title, author);
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Genre: History");
    }

}
