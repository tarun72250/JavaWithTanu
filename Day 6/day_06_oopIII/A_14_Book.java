package day_06_oopIII;

public class A_14_Book {
    private static int bkNo ;
    private int bookId;
    private A_14_Author author;
    private float price;
    private int qty;

    // Static block to initialize bkNo

    static {
        bkNo = 1000;
    }

    // Default constructor
    public A_14_Book() {
        this.bookId = bkNo++;
    }

  

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public A_14_Author getAuthor() {
        return author;
    }

    public void setAuthor(A_14_Author author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
