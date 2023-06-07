package com.Online_Education_Platform.Online_Education_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double amount;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;
    private String paymentDate;
}
