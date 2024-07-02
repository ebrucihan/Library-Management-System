import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "book_borrowings")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id", columnDefinition = "serial")
    private int id;

    @Column(name = "borrower_name", length = 100, nullable = false)
    private String borrowerName;

    @Column(name = "borrowing_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date borrowingDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;

    public BookBorrowing() {
    }

    public BookBorrowing(String borrowerName, Date borrowingDate) {
        this.borrowerName = borrowerName;
        this.borrowingDate = borrowingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
