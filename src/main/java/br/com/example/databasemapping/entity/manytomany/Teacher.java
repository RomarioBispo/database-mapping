package br.com.example.databasemapping.entity.manytomany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String department;

    // joinTable will create a auxiliar table with the joincolum and the inversejoincolumn columns
    @ManyToMany
    @JoinTable(
            name = "teacher_course_rel",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> courses;
}
