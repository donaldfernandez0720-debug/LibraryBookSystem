
/*
 * Name: Donald Fer F. Planteras
 * Section: BSIT-2B
 * Date: November 15, 2026
 * Activity: Java OOP Laboratory Activity 3
 */

public class Main {

    public static void main(String[] args) {

        // Create Book Objects
        Book book1 = new Book(
            "Noli Me Tangere", "Jose Rizal", "ISBN-001", 350.00
        );

        Book book2 = new Book(
            "El Filibusterismo", "Jose Rizal", "ISBN-002", 320.00
        );

        // Create EBook Object
        EBook book3 = new EBook(
            "Florante at Laura",
            "Francisco Balagtas",
            "ISBN-003",
            150.00,
            "PDF"
        );

        // Display Book Information
        System.out.println("===== BOOK INFORMATION =====");

        book1.displayInfo();

        System.out.println();

        book2.displayInfo();

        // Display EBook Information
        System.out.println("\n===== E-BOOK =====");

        book3.displayInfo();

        // Update Book Price
        book2.setPrice(299.50);

        // Display Updated Information
        System.out.println("\n===== UPDATED INFORMATION =====");

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why is it better to change the price through setPrice()
 *    instead of making price public?
 *
 * Answer:
 * It is better to use setPrice() because it allows us to
 * validate the price before changing it. It prevents
 * negative values and protects the data.
 *
 *
 * 2. Which members does EBook inherit from Book, and which
 *    does it add on its own?
 *
 * Answer:
 * EBook inherits the title, author, isbn, price,
 * constructors are not inherited, getters, setters,
 * and displayInfo() method from Book.
 * It adds its own private fileFormat attribute,
 * getter, setter, and overridden displayInfo() method.
 *
 *
 * 3. If the library later adds an AudioBook class,
 *    how would inheritance make the work easier?
 *
 * Answer:
 * We can create AudioBook as another child class
 * that extends Book. It can reuse the existing
 * attributes, getters, setters, and methods from Book.
 * We only need to add its own attributes and methods
 * for audio information without rewriting the parent code.
 */
