import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Date;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("librarymanagementsystem");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Author author = new Author("J.K. Rowling", 1965, "United Kingdom");
            Publisher publisher = new Publisher("Bloomsbury", 1986, "London, UK");
            Category category = new Category("Fantasy", "Fantasy books");

            Book book = new Book("Harry Potter and the Philosopher's Stone", 1997, 10);
            book.setAuthor(author);
            book.setPublisher(publisher);
            book.getCategories().add(category);

            // Using java.sql.Date for compatibility with JDBC
            BookBorrowing borrowing = new BookBorrowing("John Doe", new Date(System.currentTimeMillis()));
            borrowing.setBook(book);

            entityManager.persist(author);
            entityManager.persist(publisher);
            entityManager.persist(category);
            entityManager.persist(book);
            entityManager.persist(borrowing);

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}