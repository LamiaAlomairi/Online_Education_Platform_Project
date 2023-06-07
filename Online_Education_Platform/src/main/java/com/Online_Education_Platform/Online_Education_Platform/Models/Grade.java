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
    Integer id;
    Double gradeValue;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Assignment assignment;

    @ManyToOne
    private Quiz quiz;
}
