package com.Online_Education_Platform.Online_Education_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Discussion")
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String discussionDate;
    String discussionTopic;

    @ManyToOne
    private Course course;
}
