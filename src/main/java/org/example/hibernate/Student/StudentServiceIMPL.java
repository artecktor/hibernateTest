package org.example.hibernate.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceIMPL(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
