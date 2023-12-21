package seminar_4.homeTask_4;

import java.util.List;

public interface BookRepository {
    Book findById(String id);

    List<Book> findAll();
}