public class Fantasy extends Books{

    public Fantasy(String title, String author){
        super(title, author);
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Genre: Fantasy");
    }

}
