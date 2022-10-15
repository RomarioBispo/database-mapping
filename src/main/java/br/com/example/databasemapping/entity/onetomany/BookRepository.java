package br.com.example.databasemapping.entity.onetomany;

import br.com.example.databasemapping.entity.onetomany.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
