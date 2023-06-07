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
    Integer id;
    String name;
    String instructorMajor;
    Integer phone;

    @ManyToMany
    @JsonIgnore
    private List<Course> courses;
}
