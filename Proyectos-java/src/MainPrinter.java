public class MainPrinter {

    public static void main(String[] args) {
//        Printer printer = new Printer(5);
//        System.out.println("toner lever is " + printer.addToner(95));
//
//        Printer duplex = new Printer(100, 3, true);
//        System.out.println("Sheets printed are " + duplex.printPages(7));

//        Printer printer1 = new Printer(50, false);
//        System.out.println("initial page count = " + printer1.getPagesPrinted());
//        int pages = printer1.printPages(5);
//        System.out.printf("Current Job Pages %d, Printer Total: %d %n",
//                pages, printer1.getPagesPrinted());
//
//        pages = printer1.printPages(10);
//        System.out.printf("Current Job Pages %d, Printer Total: %d %n",
//                pages, printer1.getPagesPrinted());

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
