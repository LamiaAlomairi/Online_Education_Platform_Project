package com.Online_Education_Platform.Online_Education_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    Integer grade_id;
    @Column(name = "grade_value")
    Double grade_value;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Quiz quiz;
}
