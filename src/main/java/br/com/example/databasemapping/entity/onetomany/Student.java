package br.com.example.databasemapping.entity.onetomany;

import javax.persistence.*;
import java.util.Set;

@Table(name = "STUDENT")
@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    @Column(name = "NAME")
    private String name;

    // BIDIRECTIONAL MAPPING
    @OneToMany(mappedBy="student")
    private Set<Book> books;

// UNIDIRECTIONAL MAPPING
//    @OneToMany
//    @JoinColumn(name = "student_id")
//    private Set<Book> books;
}
