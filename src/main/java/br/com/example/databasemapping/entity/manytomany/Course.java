package br.com.example.databasemapping.entity.manytomany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer hours;
    @ManyToMany(mappedBy = "courses")
    Set<Teacher> teachers;
}
