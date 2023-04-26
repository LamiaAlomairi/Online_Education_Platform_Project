package com.Online_Education_Platform.Online_Education_Platform.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Instructor")
// teacher
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    Integer instructor_id;

    @Column(name = "instructor_name")
    String instructor_name;

    @Column(name = "instructor_major")
    String instructor_major;

    @Column(name = "instructor_phone")
    Integer instructor_phone;

    @ManyToMany
    @JsonIgnore
    private List<Course> courses;
}
