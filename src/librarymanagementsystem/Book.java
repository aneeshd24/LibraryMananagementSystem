

package librarymanagementsystem;

public class Book {
    String id, name, isbn,publisher, edition, price, pages;

    public Book(String id, String name, String isbn, String publisher, String edition, String price, String pages) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.publisher = publisher;
        this.edition = edition;
        this.price = price;
        this.pages = pages;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getEdition() {
        return edition;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPages() {
        return pages;
    }
    
    
}
