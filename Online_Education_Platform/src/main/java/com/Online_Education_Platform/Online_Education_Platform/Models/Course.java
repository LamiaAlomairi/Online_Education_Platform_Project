package com.Online_Education_Platform.Online_Education_Platform.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Enrollment> enrollments;

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private List<Instructor> instructors;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Assignment> assignments;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Quiz> quizzes;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Discussion> discussions;
}
