public class Library {
    Books book1;
    Books book2;
    Books book3;

    public Library(Books b1, Books b2, Books b3) {
        this.book1 = b1;
        this.book2 = b2;
        this.book3 = b3;
    }


    public void manageLoan(Books book) {
        if (book.isBorrowed()) {
            System.out.println("Procesing devolution of: " + book.getTitle());
            book.setBorrowed(false);
        } else {
            System.out.println("Procesing borrowed of: " + book.getTitle());
            book.setBorrowed(true);
        }
    }

    public void countByGenre(){
        int h = 0, f = 0, r = 0;

        if(book1 instanceof History) h++;
        if(book1 instanceof Fantasy) f++;
        if(book1 instanceof Romance )r++;

        if(book2 instanceof History) h++;
        if(book2 instanceof Fantasy) f++;
        if(book2 instanceof Romance )r++;

        if(book3 instanceof History) h++;
        if(book3 instanceof Fantasy) f++;
        if(book3 instanceof Romance )r++;
        System.out.println("History Books are " + h + " Fantasy Books are " + f + " Romance Books are " + r);
    }


}
