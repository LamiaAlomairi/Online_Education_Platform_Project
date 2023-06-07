package com.Online_Education_Platform.Online_Education_Platform.Repositories;

import com.Online_Education_Platform.Online_Education_Platform.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
