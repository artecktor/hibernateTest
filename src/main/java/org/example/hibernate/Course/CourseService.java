package org.example.hibernate.Course;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    List<CourseDTO> findAllWithAllTeachers();

    List<CourseDTONew> findByTeacherId(int teacherId);
}
