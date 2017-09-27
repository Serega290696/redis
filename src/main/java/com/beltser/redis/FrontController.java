package com.beltser.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Serega on 27.09.2017.
 */
@RestController
public class FrontController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/add")
    public String addStudent() {
        System.out.println("FrontController.addStudent");
        Student s = new Student();
        s.setName("serega");
        s.setId("1");
        s.setGender(Student.Gender.MALE);
        s.setGrade(1000);
        repo.saveStudent(s);
        return s.toString();
    }
}
