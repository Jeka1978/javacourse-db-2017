package com.db.composite;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 30/08/2017.
 */
public class CompositeDesignPatternTest {
    @Test
    public void testAll() throws Exception {
        Book book = new Book(10);
        Book book2 = new Book(20);
        Shelf shelf = new Shelf(100);
        shelf.addItem(book);
        shelf.addItem(book2);
        BookCase bookCase = new BookCase(1000);
        bookCase.addItem(shelf);
        Room room = new Room();
        room.addItem(bookCase);

        Assert.assertEquals(130,shelf.getPrice());
        Assert.assertEquals(1130,bookCase.getPrice());
        Assert.assertEquals(1130,room.getPrice());






















    }
}







