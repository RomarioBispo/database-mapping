package br.com.example.databasemapping.entity.onetomany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "BOOK")
@Entity
@Getter
@Setter
public class Book {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GENRE")
    private String genre;

    // BIDIRECTIONAL MAPPING
    //    JOIN COLUMN CREATES A COLUM INSIDE THIS ENTITY REPRESENTING THE JOIN COLUMN,
    //    IN THIS CASE "student_id"
    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;

//    UNIDIRECTIONAL MAPPING
//    @Column(name = "student_id")
//    private Long studentId;

    @Column(name = "NUMBER_PAGES")
    private Integer numberOfPages;
}
