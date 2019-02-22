package com.etiqa.studentmodule.repository;

import org.springframework.data.repository.CrudRepository;
import com.etiqa.studentmodule.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
