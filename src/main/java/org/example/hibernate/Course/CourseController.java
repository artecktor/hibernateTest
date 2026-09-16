package org.example.hibernate.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping()
    public List<CourseDTO> findAll() {
        return courseService.findAllWithAllTeachers();
    }
    @GetMapping("/{teacherId}")
    public List<CourseDTONew> findByTeacherId(@PathVariable int teacherId) {
        return courseService.findByTeacherId(teacherId);
    }
}
