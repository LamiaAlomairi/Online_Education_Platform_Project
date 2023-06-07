package com.Online_Education_Platform.Online_Education_Platform.Repositories;

import com.Online_Education_Platform.Online_Education_Platform.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
