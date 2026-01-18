package bibliotheke;

import java.util.List;

public class Library {
    private String library_name;
    private String library_network;
    private List<Book> books;

    public Library(String library_name, String library_network, String CSV_Path){
        this.library_name = library_name;
        this.library_network = library_network;

        /*Read the CSV file (CSV_Path) and create the List books here*/
    }
}
