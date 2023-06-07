package com.Online_Education_Platform.Online_Education_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String certificateDate;

    @OneToOne
    Enrollment enrollment;
}
