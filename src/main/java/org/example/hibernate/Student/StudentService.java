package org.example.hibernate.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void delete(int id);
    List<Student> findAllNotDeleted();
}
