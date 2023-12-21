package seminar_4.homeTask_4;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class BookServiceTest {

    @Test
    void findBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String bookId = "1";
        String expectedBookname = "Hobbit";
        String expectrdAuthorName = "Talking";

        when(bookRepository.findById(bookId)).thenReturn(new Book(bookId, expectedBookname, expectrdAuthorName));

        String bookName = bookService.findBookById(bookId).getTitle();
        assertEquals(expectedBookname, bookName);

        verify(bookRepository, times(1)).findById(bookId);
    }

}