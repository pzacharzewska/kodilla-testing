package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }

        return resultList;
    }

    @Test
    public void testListBookWithConditionsReturnList(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        assertEquals(4,theListOfBooks.size());
    }

    @Test
    public void testListBookWithConditionMoreThan20(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfBooks(15);
        List<Book> resultListOf40Books = generateListOfBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        List<Book> theListOf0Books = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOf15Books = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOf40Books = bookLibrary.listBooksWithCondition("FortyBooks");

        assertEquals(0, theListOf0Books.size());
        assertEquals(15, theListOf15Books.size());
        assertEquals(0, theListOf40Books.size());
    }

    @Test
    public void testListBookWithConditionFragmentShorterThan3(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("An");

        assertEquals(0,theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBookInHandsOfSomeUser () {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0RentBooks = new ArrayList<Book>();
        List<Book> resultListOf1RentBook = generateListOfBooks(1);
        List<Book> resultListOf5RentBook = generateListOfBooks(5);
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "00010123456");
        LibraryUser libraryUser2 = new LibraryUser("David", "Zachary", "00010123457");
        LibraryUser libraryUser3 = new LibraryUser("Mark", "Seleby", "00010123458");
        when(libraryDatabaseMock.listBooksInHandOf(libraryUser1)).thenReturn(resultListOf0RentBooks);
        when(libraryDatabaseMock.listBooksInHandOf(libraryUser2)).thenReturn(resultListOf1RentBook);
        when(libraryDatabaseMock.listBooksInHandOf(libraryUser3)).thenReturn(resultListOf5RentBook);

        List<Book> theListOf0RentBooks = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOf1RentBooks = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theListOf5RentBooks = bookLibrary.listBooksInHandsOf(libraryUser3);

        assertEquals(0, theListOf0RentBooks.size());
        assertEquals(1, theListOf1RentBooks.size());
        assertEquals(5, theListOf5RentBooks.size());
    }

}
