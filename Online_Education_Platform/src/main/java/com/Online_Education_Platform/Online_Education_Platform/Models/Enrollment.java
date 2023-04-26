package com.Online_Education_Platform.Online_Education_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Data
@Entity
public class Enrollment {
    @Id
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    private String enrollmentDate;
}
