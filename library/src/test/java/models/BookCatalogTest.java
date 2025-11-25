package models;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.BookCatalog;
import se.yrgo.models.BookNotFoundException;

import static org.junit.jupiter.api.Assertions.assertSame;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        Book getBook = bc.getBookArray()[0];
        assertSame(book1, getBook);

    }

    //G
    @Test
    public void testFindBook() {
        try {
            assertSame(book1, bc.findBook("Learning Java"));
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        try {
            assertSame(book1, bc.findBook("learning java"));
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        try{
            assertSame(book1,bc.findBook(" Learning Java "));
        } catch (BookNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {

    }

}
