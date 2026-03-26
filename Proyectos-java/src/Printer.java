public class Printer {
    private int tonerLevel; // La cantidad de toner que queda en el cartucho
    private int pagesPrinted; // conteo total de paginas impresas
    private boolean duplex; // si es impresion duplex ( por ambos lados de la hoja) o simplex

    public Printer(int tonerLevel, boolean duplex){
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount <= 0 || tonerAmount >= 100){
            return -1;
        }
        if (this.tonerLevel + tonerAmount > 100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;

    }

    public int printPages(int pages){
        int pagesToPrint = pages / 2 + pages % 2;
        if (!this.duplex){
            return this.pagesPrinted += pages;
        }
        System.out.println("Printing in duplex mode");
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
