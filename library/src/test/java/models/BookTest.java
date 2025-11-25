package models;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    //G
    @Test
    public void test2EqualBooks() {
        Book LotrCopy = new Book(2, "Lord of The Rings", "Tolkien", "12481295", " ", 5094);
        Book Lotr = new Book(2, "Lord of The Rings", "Tolkien", "12481295", " ", 5094);
        assertEquals(Lotr, LotrCopy);
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book AdamsApple = new Book(1, "Adams Äpple", "Sebastian", "851293420", " ", 10924);
        Book SharkFest = new Book(3,"Shark Eating Fest","Gustavio Rapodilio","4206969420"," ",19834);
        assertNotEquals(SharkFest, AdamsApple);

    }

}
