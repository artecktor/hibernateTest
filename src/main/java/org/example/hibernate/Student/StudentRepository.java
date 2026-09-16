package org.example.hibernate.Student;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("update Student s set s.delete = true where s.id = :id")
    @Transactional
    @Modifying
    void delete(int id);
    @Query("select s from Student s where s.delete = false")
    List<Student> findAllNotDeleted();
}
