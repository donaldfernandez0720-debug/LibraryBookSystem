
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 3
 */

public class EBook extends Book {

    // Private Attribute
    private String fileFormat;

    // Constructor
    public EBook(String title, String author, String isbn,
                 double price, String fileFormat) {

        super(title, author, isbn, price);

        this.fileFormat = fileFormat;
    }

    // Getter for fileFormat
    public String getFileFormat() {
        return fileFormat;
    }

    // Setter for fileFormat
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Format: " + fileFormat);
    }
}
