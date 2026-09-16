package org.example.hibernate.Course;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceIMPL implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceIMPL(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseDTO> findAllWithAllTeachers() {
        return courseRepository.findAllWithAllTeachers();
    }

    @Override
    public List<CourseDTONew> findByTeacherId(int teacherId) {
        return courseRepository.findByTeacherId(teacherId);
    }
}
