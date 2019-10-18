package items;

public class Book extends Item{
    private String title;
    private String author;
    private String instrumentCovered;

    public Book(String title, String author, String instrumentCovered, double purchasePrice, double salePrice) {
        super(purchasePrice, salePrice);
        this.title = title;
        this.author = author;
        this.instrumentCovered = instrumentCovered;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getInstrumentCovered() {
        return instrumentCovered;
    }
}
