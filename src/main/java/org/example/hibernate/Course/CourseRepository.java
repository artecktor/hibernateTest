package org.example.hibernate.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("select new org.example.hibernate.Course.CourseDTO(c.name, c.teacher.name) from Course c")
    List<CourseDTO> findAllWithAllTeachers();

    @Query("select new org.example.hibernate.Course.CourseDTONew(c.name, c.id) from Course c where c.teacher.id = :teacherId")
    List<CourseDTONew> findByTeacherId(int teacherId);
}
