package com.dush.demo.student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "Dush valentin", "codesvalentin@gmail.com", LocalDate.of(2000, Month.DECEMBER, 25), 14)
        );
    }
}
