package bibliotheke;

public class Book {
    private String title;
    private String author;
    private String theme;
    private String isbn;
    private Integer page_number;
    private String publisher;
    private Integer publication_date;
    private boolean borrowed;

    public String getTitle() {return this.title;}

    public String getAuthor(){return this.author;}

    public String getTheme(){return this.theme;}

    public String getISBN(){return this.isbn;}

    public Integer getPageNumber(){return this.page_number;}

    public String getPublisher(){return this.publisher;}

    public Integer getPublicationDate(){return this.publication_date;}

    public boolean isBorrowed(){return this.borrowed;}
}
